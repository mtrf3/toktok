package kotlin.jvm.internal;

import X.AbstractC46064I6a;
import X.AbstractC65781Prl;
import X.C45479Ht5;
import X.C45519Htj;
import X.C45569HuX;
import X.C45570HuY;
import X.C46070I6g;
import X.C46084I6u;
import X.C76800UCe;
import X.C78897Uxp;
import X.C79057V0z;
import X.C83728WtY;
import X.EnumC83729WtZ;
import X.HBT;
import X.I02;
import X.I0E;
import X.InterfaceC88472Yns;
import X.WM7;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class AqS50S0110000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AqS50S0110000_7 aqS50S0110000_7, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        AbstractC46064I6a abstractC46064I6a = (AbstractC46064I6a) aqS50S0110000_7.l0;
        C46084I6u c46084I6u = abstractC46064I6a.LLIIJI;
        if (c46084I6u != null) {
            c46084I6u.LLJJ(false, new C46070I6g(abstractC46064I6a, aqS50S0110000_7.z1, booleanValue));
            return C76800UCe.LIZ;
        }
        o.LJIJI(WM7.SCENE_SERVICE);
        throw null;
    }

    public static final Object invoke$1(AqS50S0110000_7 aqS50S0110000_7, Object it) {
        o.LJIIIZ(it, "it");
        if (o.LJ(it, ClosingChooseMediaPageState.Closed.INSTANCE)) {
            ((I02) aqS50S0110000_7.l0).getCameraApiComponent().jL().LIZIZ(I0E.RECORD_LOCAL_MEDIA_SCENE, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.OPEN_CAMERA_CLOSE_SLIDE_ALBUM, null));
            I02 i02 = (I02) aqS50S0110000_7.l0;
            i02.LJLL = false;
            i02.LJLLI = false;
            i02.LJLJJL = 0.0f;
            i02.LJLJJLL = 0.0f;
            if (C79057V0z.LJIIZILJ(C78897Uxp.LJJJJ(i02.LJLIL), MvChoosePhotoScene.class) && aqS50S0110000_7.z1) {
                I02 i022 = (I02) aqS50S0110000_7.l0;
                if (i022.LJLJJI != null) {
                    NavigationScene LJJJJ = C78897Uxp.LJJJJ(i022.LJLIL);
                    MvChoosePhotoScene mvChoosePhotoScene = ((I02) aqS50S0110000_7.l0).LJLJJI;
                    if (mvChoosePhotoScene != null) {
                        LJJJJ.remove(mvChoosePhotoScene);
                        ((I02) aqS50S0110000_7.l0).LJLJJI = null;
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
            ChooseMediaViewModel LJJLIIIJILLIZJL = ((I02) aqS50S0110000_7.l0).LJJLIIIJILLIZJL();
            if (LJJLIIIJILLIZJL != null) {
                LJJLIIIJILLIZJL.LJLJJLL.clear();
                LJJLIIIJILLIZJL.LJLJL.clear();
                LJJLIIIJILLIZJL.LJLJLJ.clear();
                LJJLIIIJILLIZJL.LJLLJ = 0;
                LJJLIIIJILLIZJL.setState(C45570HuY.LJLIL);
            }
            ((I02) aqS50S0110000_7.l0).getStickerApiComponent().cF(false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS50S0110000_7 aqS50S0110000_7, Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        C45519Htj choosePhotoConfig = (C45519Htj) obj;
        o.LJIIIZ(choosePhotoConfig, "$this$choosePhotoConfig");
        boolean z5 = true;
        if ((((MvChoosePhotoScene) aqS50S0110000_7.l0).LLLLLLL() && !((MvChoosePhotoScene) aqS50S0110000_7.l0).LJZL) || (((MvChoosePhotoScene) aqS50S0110000_7.l0).LLLLZLL() && aqS50S0110000_7.z1)) {
            z = true;
        } else {
            z = false;
        }
        choosePhotoConfig.LIZIZ = z;
        choosePhotoConfig.LIZ = HBT.LIZ();
        if (((MvChoosePhotoScene) aqS50S0110000_7.l0).LLLLZLL() || ((MvChoosePhotoScene) aqS50S0110000_7.l0).LLLLLLL()) {
            z2 = true;
        } else {
            z2 = false;
        }
        choosePhotoConfig.LIZJ = z2;
        if (((MvChoosePhotoScene) aqS50S0110000_7.l0).LLLLLLL() || (((MvChoosePhotoScene) aqS50S0110000_7.l0).LLLLZLL() && aqS50S0110000_7.z1)) {
            z3 = true;
        } else {
            z3 = false;
        }
        choosePhotoConfig.LIZLLL = z3;
        if (((MvChoosePhotoScene) aqS50S0110000_7.l0).LLLLLLL() || ((((MvChoosePhotoScene) aqS50S0110000_7.l0).LLLLZLL() && aqS50S0110000_7.z1) || ((MvChoosePhotoScene) aqS50S0110000_7.l0).LLLLZLLIL() || ((MvChoosePhotoScene) aqS50S0110000_7.l0).LLLLZLLLI() || ((MvChoosePhotoScene) aqS50S0110000_7.l0).LLLLLLJ())) {
            MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) aqS50S0110000_7.l0;
            if (mvChoosePhotoScene.LJZL || mvChoosePhotoScene.LLLLZLLIL() || ((MvChoosePhotoScene) aqS50S0110000_7.l0).LLLLZLLLI() || ((MvChoosePhotoScene) aqS50S0110000_7.l0).LLLLLLJ()) {
                i = 2;
            } else {
                i = 1;
            }
        } else {
            i = 0;
        }
        choosePhotoConfig.LJ = i;
        if (((MvChoosePhotoScene) aqS50S0110000_7.l0).LLLLLLL() || (((MvChoosePhotoScene) aqS50S0110000_7.l0).LLLLZLL() && aqS50S0110000_7.z1)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!((MvChoosePhotoScene) aqS50S0110000_7.l0).LLLLZLL() || aqS50S0110000_7.z1) {
            z5 = false;
        }
        C45479Ht5 c45479Ht5 = new C45479Ht5(z4, (MvChoosePhotoScene) aqS50S0110000_7.l0, z5);
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = new ChoosePhotoPreviewPageConfig(0);
        c45479Ht5.invoke(choosePhotoPreviewPageConfig);
        choosePhotoConfig.LJFF = choosePhotoPreviewPageConfig;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS50S0110000_7 aqS50S0110000_7, Object obj) {
        ChooseMediaState setStateImmediate = (ChooseMediaState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return ChooseMediaState.copy$default(setStateImmediate, null, null, null, null, null, null, null, null, null, null, new C45569HuX((ArrayList) aqS50S0110000_7.l0, aqS50S0110000_7.z1), null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -1025, 7, null);
    }

    public static final Object invoke$4(AqS50S0110000_7 aqS50S0110000_7, Object obj) {
        ChooseMediaState setState = (ChooseMediaState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ChooseMediaState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, new C45569HuX((ArrayList) aqS50S0110000_7.l0, aqS50S0110000_7.z1), null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -1025, 7, null);
    }

    public static final Object invoke$5(AqS50S0110000_7 aqS50S0110000_7, Object obj) {
        ChooseMediaState setState = (ChooseMediaState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ChooseMediaState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, new C45569HuX((ArrayList) aqS50S0110000_7.l0, aqS50S0110000_7.z1), null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -2049, 7, null);
    }

    public static final Object invoke$6(AqS50S0110000_7 aqS50S0110000_7, Object obj) {
        ChooseMediaState setState = (ChooseMediaState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ChooseMediaState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, null, new C45569HuX((ArrayList) aqS50S0110000_7.l0, aqS50S0110000_7.z1), false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -4097, 7, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS50S0110000_7(I02 i02, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = i02;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS50S0110000_7(AbstractC46064I6a abstractC46064I6a, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC46064I6a;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS50S0110000_7(MvChoosePhotoScene mvChoosePhotoScene, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = mvChoosePhotoScene;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS50S0110000_7(boolean z, ArrayList arrayList, int i) {
        super(1);
        this.$t = i;
        this.l0 = arrayList;
        this.z1 = z;
    }
}
