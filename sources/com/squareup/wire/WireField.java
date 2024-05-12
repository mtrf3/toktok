package com.squareup.wire;

import X.V0N;

/* loaded from: classes12.dex */
public @interface WireField {

    /* loaded from: classes12.dex */
    public enum Label {
        REQUIRED,
        OPTIONAL,
        REPEATED,
        ONE_OF,
        PACKED;

        public final boolean LIZJ() {
            if (this == REPEATED || this == PACKED) {
                return true;
            }
            return false;
        }

        public static Label valueOf(String str) {
            return (Label) V0N.LJJJ(Label.class, str);
        }
    }

    String adapter();

    String keyAdapter() default "";

    Label label() default Label.OPTIONAL;

    boolean redacted() default false;

    int tag();
}
