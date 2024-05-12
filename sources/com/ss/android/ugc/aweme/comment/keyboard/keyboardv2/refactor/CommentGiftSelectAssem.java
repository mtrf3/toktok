package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.ARH;
import X.ActivityC45651qj;
import X.C177336xd;
import X.C188727au;
import X.C1AU;
import X.C212428Vi;
import X.C221108m2;
import X.C227768wm;
import X.C26227ARb;
import X.C2K0;
import X.C55096Ljo;
import X.C55247LmF;
import X.C62822Ol8;
import X.C72W;
import X.FMX;
import X.InterfaceC55102Lju;
import X.InterfaceC55251LmJ;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS49S0400000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentGiftSelectAssem extends UISlotAssem implements GiftSelectAbility, InterfaceC55102Lju {
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public C72W LJLLI;

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.GiftSelectAbility
    public final boolean Zr0() {
        GiftViewModel H3;
        Long value;
        Aweme aweme;
        String str;
        GiftStruct giftStruct;
        MutableLiveData<GiftStruct> jv0;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) this.LJLJLLL.getValue();
        if (activityC45651qj != null && (H3 = H3()) != null) {
            GiftStruct value2 = H3.jv0().getValue();
            if (VideoGiftService.LJI().LIZIZ() && value2 != null && !value2.isFromGiftBag() && ((value = H3.iv0().getValue()) == null || value.longValue() != Long.MIN_VALUE)) {
                long diamondCount = value2.getDiamondCount();
                Long value3 = H3.iv0().getValue();
                if (value3 == null) {
                    value3 = 0L;
                }
                o.LJIIIIZZ(value3, "this.currentCoinBalance.getValue() ?: 0L");
                if (diamondCount > value3.longValue()) {
                    ARH arh = new ARH(activityC45651qj);
                    arh.LJ(R.string.tq2, new AqS49S0400000_3(activityC45651qj, value2, H3, this, 10));
                    arh.LJI(R.string.cg_, new AqS134S0200000_3(H3, activityC45651qj, 184));
                    C26227ARb c26227ARb = new C26227ARb(activityC45651qj);
                    c26227ARb.LJ(R.string.tpe);
                    c26227ARb.LJIIL = arh;
                    c26227ARb.LJI().LIZLLL();
                    C177336xd I3 = I3();
                    Long l = null;
                    if (I3 != null) {
                        aweme = I3.LJLLI;
                    } else {
                        aweme = null;
                    }
                    C177336xd I32 = I3();
                    if (I32 != null) {
                        str = I32.LJLJJLL;
                    } else {
                        str = null;
                    }
                    GiftViewModel H32 = H3();
                    if (H32 != null && (jv0 = H32.jv0()) != null) {
                        giftStruct = jv0.getValue();
                    } else {
                        giftStruct = null;
                    }
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", str);
                    I3();
                    c188727au.LJIIIZ("enter_method", null);
                    c188727au.LJIIIZ("group_id", C227768wm.LIZIZ(aweme));
                    if (giftStruct != null) {
                        l = Long.valueOf(giftStruct.getId());
                    }
                    c188727au.LJFF(l, "gift_id");
                    c188727au.LJIIIZ("author_id", C227768wm.LIZJ(aweme));
                    FMX.LJIIL("show_comment_recharge_popup", c188727au.LIZ);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1942240631) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.pv;
    }

    public CommentGiftSelectAssem() {
        new LinkedHashMap();
        this.LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 103));
        this.LJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 102));
    }

    public final GiftViewModel H3() {
        return (GiftViewModel) this.LJLL.getValue();
    }

    public final C177336xd I3() {
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55096Ljo.LJIIZILJ(this), C177336xd.class, "source_default_key");
        if (LIZLLL != null) {
            return (C177336xd) LIZLLL.getSource();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        GiftViewModel H3;
        super.onDestroy();
        C1AU c1au = (C1AU) this.LJLJLLL.getValue();
        if (c1au == null || (H3 = H3()) == null) {
            return;
        }
        H3.iv0().removeObservers(c1au);
        H3.jv0().removeObservers(c1au);
        H3.kv0().removeObservers(c1au);
        H3.lv0().removeObservers(c1au);
        ((LiveData) H3.LJLJJL.getValue()).removeObservers(c1au);
        H3.iv0().setValue(Long.MIN_VALUE);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ActivityC45651qj mo49getActivity;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL == null || (mo49getActivity = LIZLLL.mo49getActivity()) == null) {
            return;
        }
        View findViewById = view.findViewById(R.id.jmc);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.selected_gift_container)");
        this.LJLLI = (C72W) findViewById;
        GiftViewModel H3 = H3();
        if (H3 != null) {
            C72W c72w = this.LJLLI;
            if (c72w != null) {
                c72w.LIZ(H3, mo49getActivity, false);
            } else {
                o.LJIJI("selectedGiftContainer");
                throw null;
            }
        }
    }
}
