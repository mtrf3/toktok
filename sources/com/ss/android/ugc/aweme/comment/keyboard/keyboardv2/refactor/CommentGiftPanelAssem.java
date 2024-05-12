package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.ActivityC45651qj;
import X.C177336xd;
import X.C1790871c;
import X.C1792171p;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C2K0;
import X.C47261Igj;
import X.C55096Ljo;
import X.C55247LmF;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC1792471s;
import X.InterfaceC55102Lju;
import X.InterfaceC55251LmJ;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentGiftPanelAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentGiftPanelAssem extends UISlotAssem implements IKeyboardProtocol, ICommentGiftPanelAssemVAbility, InterfaceC55102Lju {
    public final C62822Ol8 LJLJLLL;
    public C1792171p LJLL;
    public final IVideoGiftService LJLLI;
    public final C214298b3 LJLLILLLL;

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void LLJJJ() {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1068315276) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.cpy;
    }

    public CommentGiftPanelAssem() {
        new LinkedHashMap();
        this.LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 100));
        this.LJLLI = VideoGiftService.LJI();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(KeyboardVMV2.class);
        this.LJLLILLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 101), C1790871c.INSTANCE, null);
    }

    public final void H3() {
        Aweme aweme;
        C177336xd I3;
        C177336xd I32;
        Aweme aweme2;
        GiftViewModel giftViewModel;
        IVideoGiftService iVideoGiftService = this.LJLLI;
        C177336xd I33 = I3();
        if (I33 != null) {
            aweme = I33.LJLLI;
        } else {
            aweme = null;
        }
        if (iVideoGiftService.LIZ(aweme)) {
            C177336xd I34 = I3();
            if (((I34 != null && I34.LJLL == 1) || ((I3 = I3()) != null && I3.LJLL == 2)) && this.LJLJLLL.getValue() != null && (I32 = I3()) != null && (aweme2 = I32.LJLLI) != null && (giftViewModel = (GiftViewModel) this.LJLJLLL.getValue()) != null) {
                String aid = aweme2.getAid();
                o.LJIIIIZZ(aid, "this.aid");
                String authorUid = aweme2.getAuthorUid();
                o.LJIIIIZZ(authorUid, "this.authorUid");
                giftViewModel.hv0(aid, authorUid);
            }
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        C177336xd I3;
        C177336xd I32;
        Fragment LIZLLL;
        ActivityC45651qj mo49getActivity;
        View view;
        ViewGroup viewGroup;
        GiftViewModel giftViewModel;
        Fragment LIZLLL2;
        if (this.LJLJLLL.getValue() != null && (I3 = I3()) != null && I3.LJLLI != null && (I32 = I3()) != null && I32.LJLLI != null && (LIZLLL = C212428Vi.LIZLLL(this)) != null && (mo49getActivity = LIZLLL.mo49getActivity()) != null && (view = getSupervisor().LJLLL) != null && (viewGroup = (ViewGroup) view.findViewById(this.LJLIL)) != null && (giftViewModel = (GiftViewModel) this.LJLJLLL.getValue()) != null && (LIZLLL2 = C212428Vi.LIZLLL(this)) != null) {
            C1792171p c1792171p = new C1792171p(LIZLLL2, viewGroup, mo49getActivity, giftViewModel, new InterfaceC1792471s() { // from class: X.71a
                @Override // X.InterfaceC1792471s
                public final void P0() {
                    IKeyboardInputPanelAssemAbility LIZ = C176356w3.LIZ(C55096Ljo.LJIIZILJ(CommentGiftPanelAssem.this));
                    if (LIZ != null) {
                        LIZ.Af();
                    }
                }
            }, false);
            this.LJLL = c1792171p;
            View view2 = c1792171p.LJII;
            if (view2 != null) {
                E3(view2);
            }
        }
        super.onCreateView();
    }

    public final C177336xd I3() {
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

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void LLZZ() {
        H3();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJII(this, this.LJLLILLLL.getValue(), new TBT() { // from class: X.71b
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C177616y5) obj).LJLLLL;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 21), 4);
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), IKeyboardProtocol.class, C47261Igj.LJJIJIL(this));
        H3();
    }
}
