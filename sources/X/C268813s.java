package X;

import Y.ARunnableS43S0100000_7;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.jvm.internal.o;

/* renamed from: X.13s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C268813s {
    public final Object LIZ;
    public final Object LIZIZ;
    public final Object LIZJ;
    public final Object LIZLLL;

    public final void LIZ() {
        String str;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", ((AwemeDraft) this.LIZIZ).LIZ());
        c145995oB.LJI("shoot_way", ((AwemeDraft) this.LIZIZ).LJJJJI.shootWay);
        AwemeDraft awemeDraft = (AwemeDraft) this.LIZIZ;
        o.LJIIIZ(awemeDraft, "<this>");
        int i = awemeDraft.LJJJJI.from;
        if (i == 0 || i == 1 || awemeDraft.LJIIL()) {
            str = "upload";
        } else {
            str = "shoot";
        }
        c145995oB.LJI("content_source", str);
        c145995oB.LJI("content_type", C41802Gas.LIZIZ((AwemeDraft) this.LIZIZ));
        c145995oB.LIZIZ((System.currentTimeMillis() - ((AwemeDraft) this.LIZIZ).lastEditTime) / 1000, "diff_duration");
        FMX.LJIIL("auto_retry_start", c145995oB.LIZ);
        GVX gvx = GVX.LIZ;
        GVX.LIZIZ = true;
        if (((InterfaceC41365GLh) this.LIZLLL).LIZJ().size() >= 2) {
            GVX.LIZLLL = true;
        }
        InterfaceC41365GLh interfaceC41365GLh = (InterfaceC41365GLh) this.LIZLLL;
        interfaceC41365GLh.LIZ(interfaceC41365GLh.LIZJ());
        ((InterfaceC41365GLh) this.LIZLLL).LIZIZ();
        C41732GZk.LIZ();
        H78.LJI("Publish | remove recover path by dismiss panel");
        gvx.LIZJ(true);
        ((InterfaceC41365GLh) this.LIZLLL).LIZLLL((ActivityC45651qj) this.LIZ, (AwemeDraft) this.LIZIZ, null);
        GW2 gw2 = (GW2) this.LIZJ;
        if (gw2 != null) {
            gw2.LIZLLL.execute(new ARunnableS43S0100000_7(gw2, 139));
        }
    }

    public C268813s(ActivityC45651qj mFragmentActivity, AwemeDraft awemeDraft) {
        o.LJIIIZ(mFragmentActivity, "mFragmentActivity");
        this.LIZ = mFragmentActivity;
        this.LIZIZ = awemeDraft;
        this.LIZLLL = C268713r.LIZ();
        String LIZJ = awemeDraft.LIZJ();
        o.LJI(LIZJ);
        GW2 gw2 = new GW2(mFragmentActivity, LIZJ);
        this.LIZJ = gw2;
        gw2.LIZJ = gw2.LIZLLL.submit(CallableC41376GLs.LJLIL);
    }

    public C268813s(String str, String str2, String str3) {
        HH1.LIZ(str, "audioPath", str2, "modelPath", str3, "businessType");
        this.LIZ = str;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }

    public /* synthetic */ C268813s(C44441om c44441om, C44441om c44441om2, C44451on c44451on, C44451on c44451on2) {
        this.LIZ = c44441om;
        this.LIZIZ = c44441om2;
        this.LIZJ = c44451on;
        this.LIZLLL = c44451on2;
    }
}
