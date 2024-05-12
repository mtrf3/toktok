package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C111534Zh;
import X.C176356w3;
import X.C176996x5;
import X.C177336xd;
import X.C177796yN;
import X.C177816yP;
import X.C177876yV;
import X.C177886yW;
import X.C177896yX;
import X.C178166yy;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C224748ru;
import X.C2K0;
import X.C55096Ljo;
import X.C55247LmF;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71Y;
import X.C75W;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC177046xA;
import X.InterfaceC1793272a;
import X.InterfaceC1801475e;
import X.InterfaceC55102Lju;
import X.InterfaceC55251LmJ;
import X.TBT;
import X.X1D;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class HorizontalEmojiMiniPanelAssem extends UISlotAssem implements HorizontalEmojiAbility, InterfaceC1801475e, InterfaceC1793272a, InterfaceC55102Lju {
    public static final C177816yP LJLLILLLL = new Object() { // from class: X.6yP
    };
    public C111534Zh LJLJLLL;
    public final C214298b3 LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    @Override // X.InterfaceC1793272a
    public final boolean Hf() {
        return true;
    }

    @Override // X.InterfaceC1801475e
    public final void LLLLIIIILLL() {
    }

    @Override // X.InterfaceC1801475e
    public final void Pa(View view, Emoji emoji) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(emoji, "emoji");
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 10693085) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.pz;
    }

    @Override // X.InterfaceC1793272a
    public final List<CommentPersonalizedEmoji> wj() {
        Aweme aweme;
        C177336xd H3 = H3();
        if (H3 != null) {
            aweme = H3.LJLLI;
        } else {
            aweme = null;
        }
        return C75W.LIZIZ(aweme);
    }

    public HorizontalEmojiMiniPanelAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(KeyboardVMV2.class);
        this.LJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 111), C177796yN.INSTANCE, null);
    }

    public final KeyboardVMV2 I3() {
        return (KeyboardVMV2) this.LJLL.getValue();
    }

    @Override // X.InterfaceC1793272a
    public final boolean Gk() {
        if (o.LJ(I3().gv0(), C177886yW.LIZ) || o.LJ(I3().gv0(), C177896yX.LIZ) || o.LJ(I3().gv0(), C177876yV.LIZ)) {
            return true;
        }
        return false;
    }

    public final C177336xd H3() {
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55096Ljo.LJIIZILJ(this), C177336xd.class, "source_default_key");
        if (LIZLLL != null) {
            return (C177336xd) LIZLLL.getSource();
        }
        return null;
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    public final void K3(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hidePanel ");
        LIZ.append(z);
        C71Y.LIZLLL("HorizontalEmojiAssem", X1D.LIZIZ(LIZ));
        C111534Zh c111534Zh = this.LJLJLLL;
        if (c111534Zh != null) {
            c111534Zh.LIZJ(z);
        } else {
            o.LJIJI("miniPanel");
            throw null;
        }
    }

    public final void L3(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showPanel ");
        LIZ.append(z);
        C71Y.LIZLLL("HorizontalEmojiAssem", X1D.LIZIZ(LIZ));
        C111534Zh c111534Zh = this.LJLJLLL;
        if (c111534Zh != null) {
            c111534Zh.LJ(z);
        } else {
            o.LJIJI("miniPanel");
            throw null;
        }
    }

    @Override // X.InterfaceC1801475e
    public final boolean Q0(String emojiText) {
        C176996x5 EJ;
        String str;
        Aweme aweme;
        o.LJIIIZ(emojiText, "emojiText");
        IRefactorKeyboardFragment LIZ = C178166yy.LIZ(C55096Ljo.LJIIZILJ(this));
        String str2 = null;
        if (LIZ != null && (EJ = LIZ.EJ()) != null) {
            C177336xd H3 = H3();
            if (H3 != null && (aweme = H3.LJLLI) != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            C177336xd H32 = H3();
            if (H32 != null) {
                str2 = H32.LJLJJLL;
            }
            if (EJ.LJJLIIIJJI(str, str2, "click_comment_emotion")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C224748ru U1;
        LifecycleOwner lifecycleOwner;
        String str;
        o.LJIIIZ(view, "view");
        getContainerView().setVisibility(0);
        Map<Integer, View> map = this.LJLLI;
        Integer valueOf = Integer.valueOf(R.id.e6v);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view2 = (View) linkedHashMap.get(valueOf);
        if (view2 == null) {
            View containerView = getContainerView();
            if (containerView != null && (view2 = containerView.findViewById(R.id.e6v)) != null) {
                linkedHashMap.put(valueOf, view2);
            } else {
                view2 = null;
            }
        }
        C111534Zh horizontal_emoji_mini_panel = (C111534Zh) view2;
        o.LJIIIIZZ(horizontal_emoji_mini_panel, "horizontal_emoji_mini_panel");
        this.LJLJLLL = horizontal_emoji_mini_panel;
        IKeyboardInputPanelAssemAbility LIZ = C176356w3.LIZ(C55096Ljo.LJIIZILJ(this));
        if (LIZ == null || (U1 = LIZ.U1()) == null) {
            return;
        }
        C111534Zh c111534Zh = this.LJLJLLL;
        if (c111534Zh != null) {
            View containerView2 = getContainerView();
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null) {
                lifecycleOwner = LIZLLL.getViewLifecycleOwner();
            } else {
                lifecycleOwner = null;
            }
            c111534Zh.LIZIZ(containerView2, U1, 150, this, this, lifecycleOwner);
            if (PersonalizedEmojiExperiment.LIZ()) {
                K3(false);
            }
            C111534Zh c111534Zh2 = this.LJLJLLL;
            if (c111534Zh2 != null) {
                C177336xd H3 = H3();
                if (H3 == null || (str = H3.LJLJJLL) == null) {
                    str = "";
                }
                c111534Zh2.setMEnterFrom(str);
                C8YN.LJII(this, I3(), new TBT() { // from class: X.6yL
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C177616y5) obj).LJZL;
                    }
                }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 26), 4);
                C8YN.LJII(this, I3(), new TBT() { // from class: X.6yM
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C177616y5) obj).LL;
                    }
                }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 27), 4);
                C8YN.LJII(this, I3(), new TBT() { // from class: X.6yK
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C177616y5) obj).LLF;
                    }
                }, null, new AqS185S0100000_3(this, 28), 6);
                return;
            }
            o.LJIJI("miniPanel");
            throw null;
        }
        o.LJIJI("miniPanel");
        throw null;
    }

    @Override // X.InterfaceC1801475e
    public final void onEmojiClick(String emojiText, int i, int i2) {
        C176996x5 EJ;
        InterfaceC177046xA interfaceC177046xA;
        o.LJIIIZ(emojiText, "emojiText");
        IRefactorKeyboardFragment LIZ = C178166yy.LIZ(C55096Ljo.LJIIZILJ(this));
        if (LIZ != null && (EJ = LIZ.EJ()) != null && (interfaceC177046xA = EJ.LJLJJI) != null) {
            interfaceC177046xA.onEmojiClick(emojiText, i, i2);
        }
    }
}
