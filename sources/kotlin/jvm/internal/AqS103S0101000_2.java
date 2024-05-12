package kotlin.jvm.internal;

import X.AbstractC1304059w;
import X.AbstractC65781Prl;
import X.C0CM;
import X.C126114xD;
import X.C1297357h;
import X.C156086Aq;
import X.C164676dD;
import X.C188727au;
import X.C59L;
import X.C5FH;
import X.C5LS;
import X.C6EC;
import X.C6ES;
import X.C6EV;
import X.C6M6;
import X.C76800UCe;
import X.C78983UzD;
import X.FMX;
import X.H7R;
import X.InterfaceC126134xF;
import X.InterfaceC65784Pro;
import X.ProgressDialogC173696rl;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.gamora.editorpro.tts.TTSFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class AqS103S0101000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS103S0101000_2 aqS103S0101000_2) {
        int size = View.MeasureSpec.getSize(aqS103S0101000_2.i1);
        AbstractC1304059w abstractC1304059w = (AbstractC1304059w) aqS103S0101000_2.l0;
        if (size == 0) {
            size = abstractC1304059w.getScreenWidth();
        }
        return Integer.valueOf(size);
    }

    public static final Object invoke$1(AqS103S0101000_2 aqS103S0101000_2) {
        View LIZ;
        if (aqS103S0101000_2.i1 >= 0) {
            int size = ((ArrayList) ((C1297357h) aqS103S0101000_2.l0).LJLILLLLZI).size();
            int i = aqS103S0101000_2.i1;
            if (size > i && (LIZ = ((C59L) ListProtector.get(((C1297357h) aqS103S0101000_2.l0).LJLILLLLZI, i)).LIZ(R.id.et1)) != null) {
                LIZ.invalidate();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS103S0101000_2 aqS103S0101000_2) {
        InterfaceC126134xF interfaceC126134xF = ((C126114xD) aqS103S0101000_2.l0).LIZJ;
        if (interfaceC126134xF != null) {
            interfaceC126134xF.onProgress((int) (aqS103S0101000_2.i1 * 0.95f));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS103S0101000_2 aqS103S0101000_2) {
        int size = View.MeasureSpec.getSize(aqS103S0101000_2.i1);
        C5FH c5fh = (C5FH) aqS103S0101000_2.l0;
        if (size == 0) {
            size = c5fh.getScreenWidth();
        }
        return Integer.valueOf(size);
    }

    public static final Object invoke$3(AqS103S0101000_2 aqS103S0101000_2) {
        C5LS c5ls = (C5LS) aqS103S0101000_2.l0;
        c5ls.LJI = aqS103S0101000_2.i1;
        ProgressDialogC173696rl progressDialogC173696rl = c5ls.LJFF;
        if (progressDialogC173696rl != null && progressDialogC173696rl.isShowing()) {
            progressDialogC173696rl.setProgress(Math.min(((C5LS) aqS103S0101000_2.l0).LJI, 100));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS103S0101000_2 aqS103S0101000_2) {
        String creationId = ((C6EC) aqS103S0101000_2.l0).LJJZZI().getCreationId();
        o.LJIIIIZZ(creationId, "model.creationId");
        String str = ((C6EC) aqS103S0101000_2.l0).LJJZZI().mShootWay;
        o.LJIIIIZZ(str, "model.mShootWay");
        String valueOf = String.valueOf(((C6EC) aqS103S0101000_2.l0).LJJZZI().draftId);
        String contentType = H7R.LJIIIZ(((C6EC) aqS103S0101000_2.l0).LJJZZI());
        String contentSource = H7R.LJIIIIZZ(((C6EC) aqS103S0101000_2.l0).LJJZZI());
        int i = aqS103S0101000_2.i1;
        String musicId = ((C6EC) aqS103S0101000_2.l0).LJJZZI().getMusicId();
        int LIZIZ = ((C6EC) aqS103S0101000_2.l0).LJLILLLLZI.LIZIZ();
        boolean LJJJJJL = C78983UzD.LJJJJJL(((C6EC) aqS103S0101000_2.l0).LJJZZI());
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(contentSource, "contentSource");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", creationId);
        c188727au.LJIIIZ("shoot_way", str);
        c188727au.LJIIIZ("draft_id", valueOf);
        c188727au.LJIIIZ("enter_from", "video_edit_page");
        c188727au.LJIIIZ("content_type", contentType);
        c188727au.LJIIIZ("content_source", contentSource);
        c188727au.LJIIIZ("music_id", musicId);
        C6ES.LIZ(i, LJJJJJL ? 1 : 0, c188727au);
        C6ES.LIZJ(LIZIZ, c188727au);
        FMX.LJIIL("sound_copyright_check_page_close", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS103S0101000_2 aqS103S0101000_2) {
        ((C6EC) aqS103S0101000_2.l0).LLIILZL();
        C6EV.LIZIZ = ((C6EC) aqS103S0101000_2.l0).LJJLI().LIZIZ(true);
        String creationId = ((C6EC) aqS103S0101000_2.l0).LJJZZI().getCreationId();
        o.LJIIIIZZ(creationId, "model.creationId");
        String str = ((C6EC) aqS103S0101000_2.l0).LJJZZI().mShootWay;
        o.LJIIIIZZ(str, "model.mShootWay");
        String valueOf = String.valueOf(((C6EC) aqS103S0101000_2.l0).LJJZZI().draftId);
        String contentType = H7R.LJIIIZ(((C6EC) aqS103S0101000_2.l0).LJJZZI());
        String contentSource = H7R.LJIIIIZZ(((C6EC) aqS103S0101000_2.l0).LJJZZI());
        int i = aqS103S0101000_2.i1;
        String musicId = ((C6EC) aqS103S0101000_2.l0).LJJZZI().getMusicId();
        int LIZIZ = ((C6EC) aqS103S0101000_2.l0).LJLILLLLZI.LIZIZ();
        boolean LJJJJJL = C78983UzD.LJJJJJL(((C6EC) aqS103S0101000_2.l0).LJJZZI());
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(contentSource, "contentSource");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", creationId);
        c188727au.LJIIIZ("shoot_way", str);
        c188727au.LJIIIZ("draft_id", valueOf);
        c188727au.LJIIIZ("enter_from", "sound_copyright_check_page");
        c188727au.LJIIIZ("content_type", contentType);
        c188727au.LJIIIZ("content_source", contentSource);
        c188727au.LJIIIZ("music_id", musicId);
        c188727au.LJIIIZ("to_status", "on");
        C6ES.LIZ(i, LJJJJJL ? 1 : 0, c188727au);
        C6ES.LIZJ(LIZIZ, c188727au);
        FMX.LJIIL("sound_copyright_check_click", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS103S0101000_2 aqS103S0101000_2) {
        ((C6M6) aqS103S0101000_2.l0).LJJZZI(new AqS27S0001000_2(aqS103S0101000_2.i1, 20));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS103S0101000_2 aqS103S0101000_2) {
        ProgressDialogC173696rl progressDialogC173696rl = ((TTSFragment) aqS103S0101000_2.l0).LLFF;
        if (progressDialogC173696rl != null && progressDialogC173696rl.isShowing()) {
            progressDialogC173696rl.setProgress(Math.min(aqS103S0101000_2.i1, 100));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS103S0101000_2 aqS103S0101000_2) {
        View view;
        switch (aqS103S0101000_2.i1) {
            case 0:
                View view2 = ((C156086Aq) ((ViewGroup) aqS103S0101000_2.l0)).LJLIL;
                if (view2 != null) {
                    return view2.findViewById(R.id.bjn);
                }
                o.LJIJI("root");
                throw null;
            default:
                C0CM parentViewPager = ((C164676dD) ((ViewGroup) aqS103S0101000_2.l0)).getParentViewPager();
                if (parentViewPager != null) {
                    view = parentViewPager.getChildAt(0);
                } else {
                    view = null;
                }
                if (!(view instanceof RecyclerView)) {
                    return null;
                }
                return view;
        }
    }

    public static final Object invoke$9(AqS103S0101000_2 aqS103S0101000_2) {
        InterfaceC126134xF interfaceC126134xF = ((C126114xD) aqS103S0101000_2.l0).LIZJ;
        if (interfaceC126134xF != null) {
            interfaceC126134xF.onProgress(aqS103S0101000_2.i1);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS103S0101000_2(int i, C1297357h c1297357h, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c1297357h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS103S0101000_2(int i, AbstractC1304059w abstractC1304059w, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = abstractC1304059w;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS103S0101000_2(int i, C5FH c5fh, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c5fh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS103S0101000_2(C126114xD c126114xD, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c126114xD;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS103S0101000_2(C5LS c5ls, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c5ls;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS103S0101000_2(C6EC c6ec, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c6ec;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS103S0101000_2(C6M6 c6m6, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c6m6;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS103S0101000_2(ViewGroup viewGroup, int i, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS103S0101000_2(TTSFragment tTSFragment, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = tTSFragment;
        this.i1 = i;
    }
}
