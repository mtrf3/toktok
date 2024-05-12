package Y;

import X.AbstractC84033WyT;
import X.C00F;
import X.C10K;
import X.C142765iy;
import X.C142885jA;
import X.C142985jK;
import X.C147295qH;
import X.C164746dK;
import X.C34K;
import X.C41021G8b;
import X.C44384HbQ;
import X.C5YW;
import X.C60903NvH;
import X.C6BI;
import X.G8G;
import X.G8P;
import X.GI1;
import X.GI3;
import X.GLI;
import X.GWN;
import X.H78;
import X.InterfaceC171126nc;
import X.InterfaceC88472Yns;
import X.P5A;
import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ARunnableS0S0520000_2 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;
    public boolean z6;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        G8G.LIZ.step("av_video_publish", "compile_sticker_done");
        if (((C34K) this.l0).element) {
            ((C147295qH) this.l1).LLLILZLLLI().Iq0();
            ((C34K) this.l0).element = false;
        }
        if (((Runnable) this.l2) != null) {
            if (C142985jK.LIZIZ() == 2) {
                ((C147295qH) this.l1).LLJLLL(true, (C142765iy) this.l3);
            }
            C147295qH c147295qH = (C147295qH) this.l1;
            Runnable runnable = (Runnable) this.l2;
            c147295qH.getClass();
            C142885jA LIZIZ = C60903NvH.LJIIJJI().getPublishService().LJFF().LIZIZ();
            if (LIZIZ.LIZLLL()) {
                runnable.run();
                return;
            } else {
                C10K.LIZJ(new ACallableS105S0100000_2(LIZIZ, 18)).LJ(new AgS120S0100000_2(runnable, 11), C10K.LJIIIIZZ, null);
                return;
            }
        }
        C147295qH c147295qH2 = (C147295qH) this.l1;
        c147295qH2.LLLLIILLL(this.z5, this.z6, new ARunnableS13S0300000_2(c147295qH2, (C142765iy) this.l3, (Runnable) this.l4, 10), false);
    }

    public final void LIZ$1() {
        CreativeInfo creativeInfo;
        if (((VideoPublishEditModel) this.l0).isMultiVideoEdit() && TextUtils.isEmpty(((VideoPublishEditModel) this.l0).multiEditVideoRecordData.coverImagePath) && C00F.LIZ(31744, 0, "creative_restore_work_phase_two", true) == 2) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.l0;
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
            CreativeInfo creativeInfo2 = videoPublishEditModel.creativeInfo;
            o.LJIIIIZZ(creativeInfo2, "mModel.creativeInfo");
            multiEditVideoStatusRecordData.coverImagePath = C6BI.LIZJ(creativeInfo2);
            InterfaceC171126nc LIZIZ = C5YW.LIZIZ();
            CreativeInfo creativeInfo3 = ((VideoPublishEditModel) this.l0).creativeInfo;
            o.LJIIIIZZ(creativeInfo3, "mModel.creativeInfo");
            final String LJIIIIZZ = C164746dK.LJIIIIZZ(LIZIZ, creativeInfo3, 6);
            VERecordData create = VERecordData.create(new AbstractC84033WyT() { // from class: X.6dJ
                @Override // X.AbstractC84033WyT
                public final String LIZJ() {
                    return LJIIIIZZ;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super("");
                }
            }, false);
            if (create == null) {
                StringBuilder sb = new StringBuilder("recordData is null: creative info: ");
                VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) this.l1;
                if (videoPublishEditModel2 != null) {
                    creativeInfo = videoPublishEditModel2.creativeInfo;
                } else {
                    creativeInfo = null;
                }
                sb.append(creativeInfo);
                sb.append(", path: ");
                sb.append(LJIIIIZZ);
                H78.LIZJ(sb.toString());
                return;
            }
            final VideoPublishEditModel videoPublishEditModel3 = (VideoPublishEditModel) this.l0;
            VEUtils.getVideoFrames(((VERecordData.VERecordSegmentData) ListProtector.get(create.getSegmentData(), 0)).mVideo, new int[]{0}, new P5A() { // from class: X.6dI
                @Override // X.P5A
                public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                    Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(byteBuffer.array()));
                    String str = VideoPublishEditModel.this.multiEditVideoRecordData.coverImagePath;
                    o.LJIIIIZZ(str, "mModel.multiEditVideoRecordData.coverImagePath");
                    C6BI.LIZLLL(createBitmap, str, null);
                    return false;
                }
            });
        }
        VideoPublishEditModel mModel = (VideoPublishEditModel) this.l0;
        o.LJIIIIZZ(mModel, "mModel");
        C44384HbQ.LLJ(mModel);
        VideoPublishEditModel mModel2 = (VideoPublishEditModel) this.l0;
        o.LJIIIIZZ(mModel2, "mModel");
        C41021G8b c41021G8b = new C41021G8b(mModel2, new GLI("CheckPointServiceImpl", 4));
        final boolean z = this.z5;
        final GWN gwn = (GWN) this.l2;
        final Activity activity = (Activity) this.l3;
        final boolean z2 = this.z6;
        final VideoPublishEditModel videoPublishEditModel4 = (VideoPublishEditModel) this.l0;
        final InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) this.l4;
        GI3.LJII(new G8P(c41021G8b, new GI1() { // from class: X.6dH
            @Override // X.GI1
            public final InterfaceC88472Yns<AwemeDraft, C76800UCe> LIZ() {
                return null;
            }

            @Override // X.GI1
            public final void LIZIZ(C142535ib c142535ib) {
                if (z) {
                    GWN gwn2 = gwn;
                    Activity activity2 = activity;
                    gwn2.getClass();
                    C6QQ.LIZ(new AqS149S0200000_2(activity2, gwn2, 108));
                }
                if (z2) {
                    Activity activity3 = activity;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    String LJFF = C86V.LJFF(R.string.p6_);
                    o.LJIIIIZZ(LJFF, "getString(R.string.post_…ge_toast_saved_to_drafts)");
                    creativeToastBuilder.message(LJFF);
                    C78915Uy7.LJJIIZI(activity3, 3058, creativeToastBuilder);
                }
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI("enter_from", "homepage_hot");
                FMX.LJIIL("save_draft_box_show", c145995oB.LIZ);
                VideoPublishEditModel mModel3 = videoPublishEditModel4;
                o.LJIIIIZZ(mModel3, "mModel");
                String str = videoPublishEditModel4.enterFrom;
                if (str == null) {
                    str = "";
                }
                H8H.LIZLLL(mModel3, str, 1, false, false, 24);
                InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                if (interfaceC88472Yns2 != null) {
                    interfaceC88472Yns2.invoke(Boolean.TRUE);
                }
                gwn.LJII = false;
            }

            @Override // X.GI1
            public final void LIZJ(C142535ib c142535ib) {
                String msg;
                if (z) {
                    GWN gwn2 = gwn;
                    Activity activity2 = activity;
                    gwn2.getClass();
                    C6QQ.LIZ(new AqS149S0200000_2(activity2, gwn2, 108));
                }
                GWN gwn3 = gwn;
                Activity activity3 = activity;
                boolean LJIJ = C30581Hy.LJIJ(c142535ib.LJLIL);
                boolean z3 = z2;
                gwn3.getClass();
                if (z3) {
                    if (LJIJ) {
                        msg = C86V.LJFF(R.string.ez8);
                    } else {
                        msg = C86V.LJFF(R.string.ez9);
                    }
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    o.LJIIIIZZ(msg, "msg");
                    creativeToastBuilder.message(msg);
                    C78915Uy7.LJJIIZI(activity3, 3059, creativeToastBuilder);
                }
                VideoPublishEditModel mModel3 = videoPublishEditModel4;
                o.LJIIIIZZ(mModel3, "mModel");
                String str = videoPublishEditModel4.enterFrom;
                if (str == null) {
                    str = "";
                }
                H8H.LIZLLL(mModel3, str, 0, false, false, 24);
                InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                if (interfaceC88472Yns2 != null) {
                    interfaceC88472Yns2.invoke(Boolean.FALSE);
                }
                gwn.LJII = false;
            }
        }));
    }

    public static final void run$0(ARunnableS0S0520000_2 aRunnableS0S0520000_2) {
        boolean LIZ;
        try {
            aRunnableS0S0520000_2.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0520000_2 aRunnableS0S0520000_2) {
        boolean LIZ;
        try {
            aRunnableS0S0520000_2.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0520000_2(Object obj, Object obj2, boolean z, Object obj3, Object obj4, boolean z2, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z5 = z;
        this.l2 = obj3;
        this.l3 = obj4;
        this.z6 = z2;
        this.l4 = obj5;
    }
}
