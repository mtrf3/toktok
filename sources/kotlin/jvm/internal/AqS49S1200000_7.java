package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC41758GaA;
import X.AbstractC65781Prl;
import X.C188727au;
import X.C42190Gh8;
import X.C42299Git;
import X.C44687HgJ;
import X.C61099NyR;
import X.C76800UCe;
import X.FMX;
import X.GUX;
import X.I15;
import X.I19;
import X.InterfaceC88472Yns;
import X.KNV;
import X.X1D;
import Y.IDeS401S0100000_2;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS60S0100000_7;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.view.ProfileNaviActivity;
import com.zhiliaoapp.musically.R;
import ujb.s;
import v5.n;

/* loaded from: classes8.dex */
public class AqS49S1200000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS49S1200000_7 aqS49S1200000_7, Object obj) {
        GUX invokeCallback = (GUX) obj;
        o.LJIIIZ(invokeCallback, "$this$invokeCallback");
        invokeCallback.onStageUpdate(aqS49S1200000_7.s0, (AbstractC41758GaA) aqS49S1200000_7.l1, aqS49S1200000_7.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS49S1200000_7 aqS49S1200000_7, Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        if (s.LJJJLZIJ(it, ((AwemeDraft) aqS49S1200000_7.l1).LIZ(), false) && !s.LJJJLZIJ(it, aqS49S1200000_7.s0, false)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(((AwemeDraft) aqS49S1200000_7.l1).LIZIZ().getCreationId());
            LIZ.append('/');
            LIZ.append(((AwemeDraft) aqS49S1200000_7.l1).LIZIZ().getVersion());
            if (s.LJJJLZIJ(it, X1D.LIZIZ(LIZ), false)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(((AwemeDraft) aqS49S1200000_7.l1).LIZIZ().getCreationId());
                LIZ2.append('/');
                LIZ2.append(((AwemeDraft) aqS49S1200000_7.l1).LIZIZ().getVersion());
                String LIZIZ = X1D.LIZIZ(LIZ2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(((CreativeInfo) aqS49S1200000_7.l2).getCreationId());
                LIZ3.append('/');
                LIZ3.append(((CreativeInfo) aqS49S1200000_7.l2).getVersion());
                return ujb.o.LJJJJZ(it, LIZIZ, X1D.LIZIZ(LIZ3), false);
            }
            return ujb.o.LJJJJZ(it, ((AwemeDraft) aqS49S1200000_7.l1).LIZ(), ((CreativeInfo) aqS49S1200000_7.l2).getCreationId(), false);
        }
        return it;
    }

    public static final Object invoke$2(AqS49S1200000_7 aqS49S1200000_7, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            ((InterfaceC88472Yns) aqS49S1200000_7.l1).invoke(null);
        } else {
            ((C42190Gh8) aqS49S1200000_7.l2).getClass();
            if (!bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                C42190Gh8 c42190Gh8 = (C42190Gh8) aqS49S1200000_7.l2;
                c42190Gh8.LIZ.setTextSize((bitmap.getHeight() / 1280) * 24.0f);
                c42190Gh8.LJ = (int) (c42190Gh8.LIZ.getTextSize() * 1.9f);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                if (!C44687HgJ.LIZIZ(aqS49S1200000_7.s0)) {
                    canvas.save();
                    canvas.restore();
                    ((InterfaceC88472Yns) aqS49S1200000_7.l1).invoke(createBitmap);
                } else {
                    C42190Gh8 c42190Gh82 = (C42190Gh8) aqS49S1200000_7.l2;
                    String str = aqS49S1200000_7.s0;
                    o.LJI(str);
                    AqS13S0500000_7 aqS13S0500000_7 = new AqS13S0500000_7((C42190Gh8) aqS49S1200000_7.l2, (C42190Gh8) bitmap, (Bitmap) canvas, (Canvas) aqS49S1200000_7.l1, (InterfaceC88472Yns<? super Bitmap, C76800UCe>) createBitmap, (Bitmap) 2);
                    c42190Gh82.getClass();
                    C42190Gh8.LIZ(str, aqS13S0500000_7);
                }
                C42299Git.LJ(bitmap);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS49S1200000_7 aqS49S1200000_7, Object obj) {
        AVMusic it = (AVMusic) obj;
        o.LJIIIZ(it, "it");
        I19 i19 = ((I15) aqS49S1200000_7.l1).LJIILL;
        i19.LIZIZ = it;
        i19.LIZJ = aqS49S1200000_7.s0;
        ((n) aqS49S1200000_7.l2).LIZJ(1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS49S1200000_7 aqS49S1200000_7, Object obj) {
        UrlModel coverMedium;
        MusicDetail it = (MusicDetail) obj;
        o.LJIIIZ(it, "it");
        Music music = it.music;
        if (music != null && (coverMedium = music.getCoverMedium()) != null) {
            MusicShootAssem musicShootAssem = (MusicShootAssem) aqS49S1200000_7.l1;
            AqS30S1300000_7 aqS30S1300000_7 = new AqS30S1300000_7(musicShootAssem, aqS49S1200000_7.s0, (MusicModel) aqS49S1200000_7.l2, coverMedium, 6);
            musicShootAssem.getClass();
            AVExternalServiceImpl.LIZ().asyncService("MusicDetailFragment", new IDLCallbackS60S0100000_7(aqS30S1300000_7, 7));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS49S1200000_7 aqS49S1200000_7, Object it) {
        o.LJIIIZ(it, "it");
        String str = aqS49S1200000_7.s0;
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        FMX.LJIIL("allow_avatar_camera", LIZLLL.LIZ);
        ProfileNaviActivity profileNaviActivity = (ProfileNaviActivity) aqS49S1200000_7.l1;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS49S1200000_7.l2;
        profileNaviActivity.getClass();
        C61099NyR.LIZIZ.LIZIZ(profileNaviActivity, TokenCert.Companion.with("bpea-tools_request_camera_permission_profile_navi")).LIZ("android.permission.CAMERA").LIZJ(new IDeS401S0100000_2(interfaceC88472Yns, 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS49S1200000_7 aqS49S1200000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.c0k, new AqS49S1200000_7(aqS49S1200000_7.s0, (String) aqS49S1200000_7.l1, (ProfileNaviActivity) aqS49S1200000_7.l2, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 5));
        actionGroup.LJIIIIZZ(R.string.c0l, new AqS55S1100000_1(aqS49S1200000_7.s0, (String) aqS49S1200000_7.l2, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 16));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS49S1200000_7(I15 i15, I15 i152, String str, n<Integer> nVar) {
        super(1);
        this.$t = nVar;
        this.l1 = i15;
        this.s0 = i152;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS49S1200000_7(AwemeDraft awemeDraft, String str, CreativeInfo creativeInfo, int i) {
        super(1);
        this.$t = i;
        this.l1 = awemeDraft;
        this.s0 = str;
        this.l2 = creativeInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS49S1200000_7(MusicShootAssem musicShootAssem, String str, MusicModel musicModel, int i) {
        super(1);
        this.$t = i;
        this.l1 = musicShootAssem;
        this.s0 = str;
        this.l2 = musicModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS49S1200000_7(String str, AbstractC41758GaA abstractC41758GaA, Object obj, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = abstractC41758GaA;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS49S1200000_7(String str, String str2, ProfileNaviActivity profileNaviActivity, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = profileNaviActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS49S1200000_7(String str, ProfileNaviActivity profileNaviActivity, AqS29S0210000_7 aqS29S0210000_7, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = profileNaviActivity;
        this.l2 = aqS29S0210000_7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS49S1200000_7(AqS111S0300000_7 aqS111S0300000_7, C42190Gh8 c42190Gh8, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = aqS111S0300000_7;
        this.l2 = c42190Gh8;
        this.s0 = str;
    }
}
