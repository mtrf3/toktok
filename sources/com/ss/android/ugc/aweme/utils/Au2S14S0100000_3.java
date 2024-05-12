package com.ss.android.ugc.aweme.utils;

import X.AbstractC226378uX;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C176996x5;
import X.C177146xK;
import X.C177176xN;
import X.C177336xd;
import X.C177886yW;
import X.C177906yY;
import X.C177916yZ;
import X.C192487gy;
import X.C192987hm;
import X.C193027hq;
import X.C1DG;
import X.C226328uS;
import X.C226358uV;
import X.C51029K0z;
import X.C55096Ljo;
import X.C73969T1h;
import X.C74Z;
import X.FMX;
import X.InterfaceC177046xA;
import X.InterfaceC55235Lm3;
import X.InterfaceC64592gB;
import X.M89;
import X.M8L;
import X.OSZ;
import X.T16;
import X.TAT;
import X.XKX;
import X.Y87;
import X.Z9N;
import Y.AfS55S0100000_3;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomMusicShootCommentAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.GiftSelectAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardIconGroupAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardInputV2Assem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS1S0020000_3;
import kotlin.jvm.internal.AqS46S1200000_3;
import kotlin.jvm.internal.IDqS13S0400000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class Au2S14S0100000_3 extends TAT {
    public final int $t;
    public Object l0;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            case 6:
                LIZ$6(this, view);
                return;
            case 7:
                LIZ$7(this, view);
                return;
            case 8:
                LIZ$8(this, view);
                return;
            case 9:
                LIZ$9(this, view);
                return;
            case 10:
                LIZ$10(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S14S0100000_3(C193027hq c193027hq, int i) {
        super(500L);
        this.$t = i;
        this.l0 = c193027hq;
    }

    public static final void LIZ$0(Au2S14S0100000_3 au2S14S0100000_3, View view) {
        InterfaceC177046xA interfaceC177046xA;
        String str;
        Aweme aweme;
        if (view != null) {
            C176996x5 L1 = ((KeyboardIconGroupAssem) au2S14S0100000_3.l0).L1();
            if (L1 != null) {
                C177336xd x3 = ((KeyboardIconGroupAssem) au2S14S0100000_3.l0).x3();
                String str2 = null;
                if (x3 != null && (aweme = x3.LJLLI) != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                C177336xd x32 = ((KeyboardIconGroupAssem) au2S14S0100000_3.l0).x3();
                if (x32 != null) {
                    str2 = x32.LJLJJLL;
                }
                if (L1.LJJLIIIJJI(str, str2, "click_comment_emotion")) {
                    return;
                }
            }
            if (o.LJ(((KeyboardIconGroupAssem) au2S14S0100000_3.l0).A3().gv0(), C177886yW.LIZ)) {
                C176996x5 L12 = ((KeyboardIconGroupAssem) au2S14S0100000_3.l0).L1();
                if (L12 != null && (interfaceC177046xA = L12.LJLJJI) != null) {
                    interfaceC177046xA.onEmojiToKeyboard("icon");
                }
            } else {
                C176996x5 L13 = ((KeyboardIconGroupAssem) au2S14S0100000_3.l0).L1();
                if (L13 != null) {
                    L13.LJJIJIIJIL();
                }
            }
            KeyboardVMV2 A3 = ((KeyboardIconGroupAssem) au2S14S0100000_3.l0).A3();
            A3.getClass();
            A3.withState(new AqS169S0100000_3(A3, 626));
        }
    }

    public static final void LIZ$1(Au2S14S0100000_3 au2S14S0100000_3, View view) {
        if (view != null) {
            KeyboardVMV2 A3 = ((KeyboardIconGroupAssem) au2S14S0100000_3.l0).A3();
            A3.getClass();
            A3.withState(new AqS169S0100000_3(A3, 627));
        }
    }

    public static final void LIZ$10(Au2S14S0100000_3 au2S14S0100000_3, View view) {
        String str;
        if (view != null) {
            ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((BottomMusicShootCommentAssem) au2S14S0100000_3.l0);
            Fragment LJIIIZ = C55096Ljo.LJIIIZ((BottomMusicShootCommentAssem) au2S14S0100000_3.l0);
            Aweme aweme = ((BottomMusicShootCommentAssem) au2S14S0100000_3.l0).getAweme();
            M89 qT = ((BottomMusicShootCommentAssem) au2S14S0100000_3.l0).qT();
            if (qT != null) {
                str = qT.getEventType();
            } else {
                str = null;
            }
            if (LJIIIIZZ != null && MSAdaptionService.LJIIL().LJI(LJIIIIZZ)) {
                C16880lQ.LLZILL(Toast.makeText(LJIIIIZZ, LJIIIIZZ.getString(R.string.f1i), 0));
            } else {
                Z9N.LIZIZ.LLILZ().LJII(LJIIIIZZ, LJIIIZ, aweme, str);
            }
        }
    }

    public static final void LIZ$2(Au2S14S0100000_3 au2S14S0100000_3, View view) {
        String str;
        Aweme aweme;
        if (view != null) {
            C176996x5 L1 = ((KeyboardIconGroupAssem) au2S14S0100000_3.l0).L1();
            if (L1 != null) {
                C177336xd x3 = ((KeyboardIconGroupAssem) au2S14S0100000_3.l0).x3();
                String str2 = null;
                if (x3 != null && (aweme = x3.LJLLI) != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                C177336xd x32 = ((KeyboardIconGroupAssem) au2S14S0100000_3.l0).x3();
                if (x32 != null) {
                    str2 = x32.LJLJJLL;
                }
                if (L1.LJJLIIIJJI(str, str2, "click_comment_at")) {
                    return;
                }
            }
            KeyboardVMV2 A3 = ((KeyboardIconGroupAssem) au2S14S0100000_3.l0).A3();
            A3.getClass();
            A3.setState(new AqS1S0020000_3(2));
        }
    }

    public static final void LIZ$3(Au2S14S0100000_3 au2S14S0100000_3, View view) {
        C176996x5 L1;
        InterfaceC177046xA interfaceC177046xA;
        String str;
        String str2;
        Aweme aweme;
        if (view != null) {
            C176996x5 L12 = ((KeyboardInputV2Assem) au2S14S0100000_3.l0).L1();
            if (L12 != null) {
                C177336xd I3 = ((KeyboardInputV2Assem) au2S14S0100000_3.l0).I3();
                if (I3 != null && (aweme = I3.LJLLI) != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                C177336xd I32 = ((KeyboardInputV2Assem) au2S14S0100000_3.l0).I3();
                if (I32 != null) {
                    str2 = I32.LJLJJLL;
                } else {
                    str2 = null;
                }
                if (L12.LJJLIIIJJI(str, str2, "click_type_comment")) {
                    return;
                }
            }
            KeyboardInputV2Assem keyboardInputV2Assem = (KeyboardInputV2Assem) au2S14S0100000_3.l0;
            if (!o.LJ(keyboardInputV2Assem.K3().gv0(), C177906yY.LIZ) && !o.LJ(((KeyboardInputV2Assem) au2S14S0100000_3.l0).K3().gv0(), C177916yZ.LIZ) && (L1 = keyboardInputV2Assem.L1()) != null && (interfaceC177046xA = L1.LJLJJI) != null) {
                interfaceC177046xA.onEmojiToKeyboard("box");
            }
            ((KeyboardInputV2Assem) au2S14S0100000_3.l0).P3(C177176xN.LJLIL);
            ((C177146xK) ((KeyboardInputV2Assem) au2S14S0100000_3.l0).LLI.getValue()).LIZ = "click_input_box";
            KeyboardVMV2 K3 = ((KeyboardInputV2Assem) au2S14S0100000_3.l0).K3();
            K3.getClass();
            K3.withState(new AqS46S1200000_3((Comment) null, "click_input_box", K3, 3));
        }
    }

    public static final void LIZ$4(Au2S14S0100000_3 au2S14S0100000_3, View view) {
        if (view != null) {
            ((KeyboardInputV2Assem) au2S14S0100000_3.l0).Q3(false);
            KeyboardVMV2 K3 = ((KeyboardInputV2Assem) au2S14S0100000_3.l0).K3();
            K3.getClass();
            K3.withState(new AqS169S0100000_3(K3, 638));
        }
    }

    public static final void LIZ$5(Au2S14S0100000_3 au2S14S0100000_3, View view) {
        String str;
        List<CommentImageModel> list;
        if (view != null) {
            C176996x5 L1 = ((KeyboardInputV2Assem) au2S14S0100000_3.l0).L1();
            if (L1 != null && (list = L1.LJZL) != null && !list.isEmpty()) {
                Y87.LIZ((CommentImageModel) ListProtector.get(list, 0));
            }
            ((KeyboardInputV2Assem) au2S14S0100000_3.l0).BU(null);
            C177336xd I3 = ((KeyboardInputV2Assem) au2S14S0100000_3.l0).I3();
            if (I3 == null || (str = I3.LJLJJLL) == null) {
                str = "";
            }
            C74Z.LJIJI(str, "delete");
        }
    }

    public static final void LIZ$6(Au2S14S0100000_3 au2S14S0100000_3, View view) {
        if (view != null) {
            ((KeyboardInputV2Assem) au2S14S0100000_3.l0).ng();
        }
    }

    public static final void LIZ$7(Au2S14S0100000_3 au2S14S0100000_3, View view) {
        C176996x5 L1;
        if (view != null) {
            InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ((KeyboardInputV2Assem) au2S14S0100000_3.l0);
            o.LJIIIZ(LJIIZILJ, "<this>");
            GiftSelectAbility giftSelectAbility = (GiftSelectAbility) C55096Ljo.LIZ(LJIIZILJ, GiftSelectAbility.class, null);
            if ((giftSelectAbility != null && giftSelectAbility.Zr0()) || (L1 = ((KeyboardInputV2Assem) au2S14S0100000_3.l0).L1()) == null) {
                return;
            }
            L1.LLIIII = "keyboard_enter";
            L1.LJJJJJL("keyboard_dialog");
            ((KeyboardInputV2Assem) au2S14S0100000_3.l0).Af();
        }
    }

    public static final void LIZ$8(Au2S14S0100000_3 au2S14S0100000_3, View view) {
        M8L.LIZ("click favorite toast");
        FMX.LJIILL("click_collection_banner", new OSZ(((C193027hq) au2S14S0100000_3.l0).LJLJI, "enter_from"));
        C192987hm.LIZ(new C192487gy().LIZJ, true).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS55S0100000_3((C193027hq) au2S14S0100000_3.l0, 17), new InterfaceC64592gB() { // from class: X.7hp
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$9(Au2S14S0100000_3 au2S14S0100000_3, View view) {
        VideoItemParams videoItemParams;
        Aweme aweme;
        AbstractC226378uX abstractC226378uX;
        ActivityC45651qj LJ;
        if (view == null || (videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL((AddYoursEntranceButtonAssem) au2S14S0100000_3.l0)) == null || (aweme = videoItemParams.getAweme()) == null || (abstractC226378uX = ((C226358uV) ((AssemViewModel) ((AddYoursEntranceButtonAssem) au2S14S0100000_3.l0).LLIIIL.getValue()).getState()).LJLIL) == null || (LJ = C1DG.LJ(view, "it.context")) == null) {
            return;
        }
        AddYoursEntranceButtonVM addYoursEntranceButtonVM = (AddYoursEntranceButtonVM) ((AddYoursEntranceButtonAssem) au2S14S0100000_3.l0).LLIIIL.getValue();
        IDqS13S0400000_3 iDqS13S0400000_3 = new IDqS13S0400000_3(aweme, abstractC226378uX, LJ, (AddYoursEntranceButtonAssem) au2S14S0100000_3.l0, 0);
        addYoursEntranceButtonVM.getClass();
        AbstractC226378uX abstractC226378uX2 = ((C226358uV) addYoursEntranceButtonVM.getState()).LJLIL;
        if (abstractC226378uX2 == null) {
            return;
        }
        XKX.LIZLLL(ViewModelKt.getViewModelScope(addYoursEntranceButtonVM), null, null, new C226328uS(abstractC226378uX2, addYoursEntranceButtonVM, iDqS13S0400000_3, null), 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S14S0100000_3(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }
}
