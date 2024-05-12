package X;

import Y.AObjectS89S0100000_14;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WOm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82216WOm extends AbstractC43665HBt {
    public final ShortVideoContext LJLLJ;
    public final C82622Wbi LJLLL;
    public ViewGroup LJLLLL;
    public ViewGroup LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public final AqS180S0100000_14 LLFF;
    public final AqS180S0100000_14 LLFFF;

    @Override // X.AbstractC43665HBt
    public final C6UV LLJJI() {
        return (C6UV) this.LLF.getValue();
    }

    @Override // X.AbstractC43665HBt
    public final InterfaceC88472Yns<C82621Wbh, C76800UCe> LLJILJIL() {
        return this.LLFF;
    }

    @Override // X.AbstractC43665HBt
    public final InterfaceC88472Yns<Intent, C76800UCe> LLJJ() {
        return this.LLFFF;
    }

    @Override // X.AbstractC43665HBt
    public final ShortVideoContext LLJJIII() {
        return this.LJLLJ;
    }

    @Override // X.AbstractC43665HBt
    public final C82622Wbi getDiContainer() {
        return this.LJLLL;
    }

    @Override // X.AbstractC43665HBt, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        LiveEvent<I9L> Fh0;
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.dcc);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.fl_bar)");
        this.LJLLLL = (ViewGroup) requireViewById;
        View requireViewById2 = requireViewById(R.id.dg5);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.fl_record_control)");
        this.LJLLLLLL = (ViewGroup) requireViewById2;
        requireViewById(R.id.dcp).setBackgroundColor(0);
        I9Y i9y = this.LJLJLLL;
        if (i9y != null && (Fh0 = i9y.Fh0()) != null) {
            Fh0.LIZLLL(this, new AObjectS89S0100000_14(this, 100));
        }
    }

    @Override // X.AbstractC43665HBt, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cdv, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C82216WOm(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3, com.ss.android.ugc.aweme.services.recording.NowsShootActivityArg r4, X.C0IB<java.lang.Boolean> r5, X.C82622Wbi r6) {
        /*
            r2 = this;
            java.lang.String r0 = "shortVideoContext"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "relayoutEvent"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "diContainer"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            com.ss.android.ugc.aweme.creative.CreativeInfo r1 = r3.creativeInfo
            java.lang.String r0 = "shortVideoContext.creativeInfo"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r4, r1, r6)
            r2.LJLLJ = r3
            r2.LJLLL = r6
            kotlin.jvm.internal.AqS164S0100000_14 r1 = new kotlin.jvm.internal.AqS164S0100000_14
            r0 = 101(0x65, float:1.42E-43)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLZ = r0
            kotlin.jvm.internal.AqS164S0100000_14 r1 = new kotlin.jvm.internal.AqS164S0100000_14
            r0 = 103(0x67, float:1.44E-43)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJZ = r0
            kotlin.jvm.internal.AqS164S0100000_14 r1 = new kotlin.jvm.internal.AqS164S0100000_14
            r0 = 104(0x68, float:1.46E-43)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJZI = r0
            kotlin.jvm.internal.AqS164S0100000_14 r1 = new kotlin.jvm.internal.AqS164S0100000_14
            r0 = 99
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJZL = r0
            kotlin.jvm.internal.AqS164S0100000_14 r1 = new kotlin.jvm.internal.AqS164S0100000_14
            r0 = 102(0x66, float:1.43E-43)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LL = r0
            kotlin.jvm.internal.AqS164S0100000_14 r1 = new kotlin.jvm.internal.AqS164S0100000_14
            r0 = 100
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LLD = r0
            kotlin.jvm.internal.AqS164S0100000_14 r1 = new kotlin.jvm.internal.AqS164S0100000_14
            r0 = 98
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LLF = r0
            kotlin.jvm.internal.AqS180S0100000_14 r1 = new kotlin.jvm.internal.AqS180S0100000_14
            r0 = 81
            r1.<init>(r2, r0)
            r2.LLFF = r1
            kotlin.jvm.internal.AqS180S0100000_14 r1 = new kotlin.jvm.internal.AqS180S0100000_14
            r0 = 82
            r1.<init>(r2, r0)
            r2.LLFFF = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82216WOm.<init>(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, com.ss.android.ugc.aweme.services.recording.NowsShootActivityArg, X.0IB, X.Wbi):void");
    }
}
