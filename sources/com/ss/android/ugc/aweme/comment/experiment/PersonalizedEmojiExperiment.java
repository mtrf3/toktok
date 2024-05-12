package com.ss.android.ugc.aweme.comment.experiment;

import X.C1801575f;
import X.C221108m2;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PersonalizedEmojiExperiment {
    public static final CommentEmojiData LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C1801575f.LJLIL);

    /* loaded from: classes4.dex */
    public static final class CommentEmojiData {

        @InterfaceC65349Pkn("emoji_leakage_close")
        public final int hideExposeEmoji;

        @InterfaceC65349Pkn("emoji_leakage_strategy")
        public final int strategy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public CommentEmojiData() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment.CommentEmojiData.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommentEmojiData)) {
                return false;
            }
            CommentEmojiData commentEmojiData = (CommentEmojiData) obj;
            return this.strategy == commentEmojiData.strategy && this.hideExposeEmoji == commentEmojiData.hideExposeEmoji;
        }

        public final int hashCode() {
            return (this.strategy * 31) + this.hideExposeEmoji;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CommentEmojiData(strategy=");
            LIZ.append(this.strategy);
            LIZ.append(", hideExposeEmoji=");
            return b0.LIZJ(LIZ, this.hideExposeEmoji, ')', LIZ);
        }

        public CommentEmojiData(int i, int i2) {
            this.strategy = i;
            this.hideExposeEmoji = i2;
        }

        public /* synthetic */ CommentEmojiData(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
        }
    }

    static {
        int i = 0;
        LIZ = new CommentEmojiData(i, i, 3, null);
    }

    public static boolean LIZ() {
        if (((CommentEmojiData) LIZIZ.getValue()).hideExposeEmoji == 1) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ() {
        if (((CommentEmojiData) LIZIZ.getValue()).strategy == 4) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ() {
        C62822Ol8 c62822Ol8 = LIZIZ;
        if (((CommentEmojiData) c62822Ol8.getValue()).strategy != 0 && ((CommentEmojiData) c62822Ol8.getValue()).strategy != 4) {
            return true;
        }
        return false;
    }
}
