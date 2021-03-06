// Generated by delombok at Sun Feb 26 12:31:38 KST 2017
package scouter.bytebuddy.matcher;

import scouter.bytebuddy.description.annotation.AnnotationDescription;
import scouter.bytebuddy.description.type.TypeDescription;

/**
 * An element matcher that matches the type of an annotation description.
 *
 * @param <T> The exact type of the annotation description that is matched.
 */
public class AnnotationTypeMatcher<T extends AnnotationDescription> extends ElementMatcher.Junction.AbstractBase<T> {
    /**
     * The type matcher to apply to an annotation's type.
     */
    private final ElementMatcher<? super TypeDescription> matcher;

    /**
     * Creates a new matcher for an annotation description's type.
     *
     * @param matcher The type matcher to apply to an annotation's type.
     */
    public AnnotationTypeMatcher(ElementMatcher<? super TypeDescription> matcher) {
        this.matcher = matcher;
    }

    @Override
    public boolean matches(T target) {
        return matcher.matches(target.getAnnotationType());
    }

    @Override
    public String toString() {
        return "ofAnnotationType(" + matcher + ')';
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof AnnotationTypeMatcher)) return false;
        final AnnotationTypeMatcher<?> other = (AnnotationTypeMatcher<?>) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$matcher = this.matcher;
        final java.lang.Object other$matcher = other.matcher;
        if (this$matcher == null ? other$matcher != null : !this$matcher.equals(other$matcher)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof AnnotationTypeMatcher;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $matcher = this.matcher;
        result = result * PRIME + ($matcher == null ? 43 : $matcher.hashCode());
        return result;
    }
}
