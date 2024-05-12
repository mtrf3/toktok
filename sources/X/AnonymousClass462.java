package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import kotlin.jvm.internal.AqS151S0100000_1;

/* renamed from: X.462, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass462 {
    public final AnonymousClass472<TuxIconView> LIZ;
    public final AnonymousClass472<View> LIZIZ;
    public final Context LIZJ;
    public C109544Rq LIZLLL;
    public BaseContent LJ;
    public BaseTemplate LJFF;
    public String LJI;
    public Integer LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJII = true;
    public final C62822Ol8 LJIIJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1025));

    public final void LIZ(boolean z) {
        int i;
        TuxIconView LIZ;
        AnonymousClass472<TuxIconView> anonymousClass472;
        C109544Rq c109544Rq;
        View LIZ2;
        if (LIZIZ(this.LJI) && (c109544Rq = this.LIZLLL) != null && c109544Rq.isSuccessOrNormal()) {
            AnonymousClass472<View> anonymousClass4722 = this.LIZIZ;
            if (anonymousClass4722 != null && (LIZ2 = anonymousClass4722.LIZ()) != null) {
                LIZ2.setVisibility(0);
                LIZ2.setTag(50331648, 57);
                LIZ2.setTag(150994944, this.LJFF);
                LIZ2.setTag(100663296, this.LJ);
                LIZ2.setTag(134217728, this.LIZLLL);
            }
            AnonymousClass472<TuxIconView> anonymousClass4723 = this.LIZ;
            if (anonymousClass4723 != null) {
                anonymousClass4723.LIZIZ();
            }
            if (z) {
                C1042547h.LJIIJJI(this.LIZLLL);
            }
        } else {
            C109544Rq c109544Rq2 = this.LIZLLL;
            if (c109544Rq2 != null) {
                Integer num = this.LJIIIIZZ;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                if (C109434Rf.LJIIIZ(c109544Rq2, i, false)) {
                    AnonymousClass472<TuxIconView> anonymousClass4724 = this.LIZ;
                    if (anonymousClass4724 != null && (LIZ = anonymousClass4724.LIZ()) != null) {
                        LIZ.setImageDrawable((Drawable) this.LJIIJ.getValue());
                        LIZ.setVisibility(0);
                        LIZ.setTag(50331648, 55);
                        LIZ.setTag(150994944, this.LJFF);
                        LIZ.setTag(100663296, this.LJ);
                        LIZ.setTag(134217728, this.LIZLLL);
                    }
                    AnonymousClass472<View> anonymousClass4725 = this.LIZIZ;
                    if (anonymousClass4725 != null) {
                        anonymousClass4725.LIZIZ();
                    }
                }
            }
            AnonymousClass472<TuxIconView> anonymousClass4726 = this.LIZ;
            if (anonymousClass4726 != null) {
                anonymousClass4726.LIZIZ();
            }
            AnonymousClass472<View> anonymousClass4727 = this.LIZIZ;
            if (anonymousClass4727 != null) {
                anonymousClass4727.LIZIZ();
            }
        }
        if (this.LJIIIZ && (anonymousClass472 = this.LIZ) != null) {
            anonymousClass472.LIZIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(java.lang.String r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 != 0) goto L4
            return r3
        L4:
            java.util.Map<java.lang.Long, X.3ks> r2 = X.C92993kt.LIZ
            long r0 = X.C92993kt.LIZIZ
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r2
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r1)
            X.3ks r0 = (X.C92983ks) r0
            if (r0 == 0) goto L1b
            java.util.Set<java.lang.String> r0 = r0.LIZ
            if (r0 != 0) goto L21
        L1b:
            r1 = 0
        L1c:
            boolean r0 = r4.LJII
            if (r0 != 0) goto L44
            return r3
        L21:
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L1b
            long r0 = X.C92993kt.LIZIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r0 = r2.get(r0)
            X.3ks r0 = (X.C92983ks) r0
            if (r0 == 0) goto L3b
            java.util.Set<java.lang.String> r0 = r0.LIZIZ
            if (r0 != 0) goto L3d
        L3b:
            r1 = 1
            goto L1c
        L3d:
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L1b
            goto L3b
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass462.LIZIZ(java.lang.String):boolean");
    }

    public AnonymousClass462(AnonymousClass472<TuxIconView> anonymousClass472, AnonymousClass472<View> anonymousClass4722, Context context) {
        this.LIZ = anonymousClass472;
        this.LIZIZ = anonymousClass4722;
        this.LIZJ = context;
    }
}
