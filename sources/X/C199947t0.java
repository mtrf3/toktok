package X;

import Y.AfS55S0100000_3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7t0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199947t0 extends LinearLayout {
    public C199927sy LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;

    private final C73318Sq2 getDisposables() {
        return (C73318Sq2) this.LJLILLLLZI.getValue();
    }

    private final C58049MqL getTvReason() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-tvReason>(...)");
        return (C58049MqL) value;
    }

    public final ImageView getIvAvatar() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-ivAvatar>(...)");
        return (ImageView) value;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getDisposables().LIZLLL();
    }

    public final void LIZ(MatchedFriendStruct matchedFriendStruct) {
        boolean z;
        List<MutualUser> userList;
        MCR mcr;
        String recType = matchedFriendStruct.getRecType();
        if (recType == null || recType.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setVisibility(8);
            return;
        }
        MutualStruct mMutualStruct = matchedFriendStruct.getMMutualStruct();
        if (mMutualStruct == null || (userList = mMutualStruct.getUserList()) == null || userList.isEmpty() || (mcr = this.LJLIL.LIZJ) == null) {
            getIvAvatar().setVisibility(8);
        } else {
            getIvAvatar().setVisibility(0);
            getIvAvatar().setImageBitmap(mcr.LIZ());
            getDisposables().LIZ(mcr.LIZIZ().LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS55S0100000_3(this, 65), new InterfaceC64592gB() { // from class: X.7t1
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }));
        }
        getTvReason().LJJJJ(matchedFriendStruct, new C58055MqR(EnumC57741MlN.NOW_POST, false, false, this.LJLIL.LJI, false, false, null, 228));
        getTvReason().setClickHandler(new AqS134S0200000_3(this, matchedFriendStruct, 272));
    }

    public final void LIZIZ(C199927sy c199927sy) {
        int i;
        int i2;
        this.LJLIL = c199927sy;
        getTvReason().setTuxFont(this.LJLIL.LJ);
        C58049MqL tvReason = getTvReason();
        Integer num = this.LJLIL.LJFF;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        tvReason.setTextColor(i);
        setOrientation(this.LJLIL.LIZIZ);
        if (this.LJLIL.LIZIZ == 0) {
            i2 = 16;
        } else {
            i2 = 1;
        }
        setGravity(i2);
        if (getOrientation() == 0) {
            getTvReason().setTextAlignment(5);
            C58049MqL tvReason2 = getTvReason();
            ViewGroup.LayoutParams layoutParams = tvReason2.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart(this.LJLIL.LIZLLL);
                layoutParams2.topMargin = 0;
                tvReason2.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        getTvReason().setTextAlignment(4);
        C58049MqL tvReason3 = getTvReason();
        ViewGroup.LayoutParams layoutParams3 = tvReason3.getLayoutParams();
        if (layoutParams3 != null) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.topMargin = this.LJLIL.LIZLLL;
            layoutParams4.setMarginStart(0);
            tvReason3.setLayoutParams(layoutParams4);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199947t0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new C199927sy(0);
        this.LJLILLLLZI = C221108m2.LIZIZ(C199967t2.LJLIL);
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1640));
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1641));
        C210188Ms.LIZIZ(context, R.layout.byp, this, true, null);
    }
}
