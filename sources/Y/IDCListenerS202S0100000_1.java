package Y;

import X.C107404Jk;
import X.C68322mC;
import X.C784636c;
import X.InterfaceC24760y8;
import X.InterfaceC88472Yns;
import android.view.View;
import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.stickercreation.fragment.VideoCreationTailFragment;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedScope;
import com.zhiliaoapp.musically.R;

/* loaded from: classes2.dex */
public class IDCListenerS202S0100000_1 implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                return;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                return;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                return;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                return;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                return;
            case 5:
                onCheckedChanged$5(this, compoundButton, z);
                return;
            case 6:
                onCheckedChanged$6(this, compoundButton, z);
                return;
            case 7:
                onCheckedChanged$7(this, compoundButton, z);
                return;
            case 8:
                onCheckedChanged$8(this, compoundButton, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS202S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(IDCListenerS202S0100000_1 iDCListenerS202S0100000_1, CompoundButton compoundButton, boolean z) {
        ((AuthorizedScope) iDCListenerS202S0100000_1.l0).setEnabled(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$1(IDCListenerS202S0100000_1 iDCListenerS202S0100000_1, CompoundButton compoundButton, boolean z) {
        ((C107404Jk) iDCListenerS202S0100000_1.l0).LIZJ(z);
        C107404Jk c107404Jk = (C107404Jk) iDCListenerS202S0100000_1.l0;
        if (c107404Jk.LJIIJ) {
            return;
        }
        c107404Jk.LJIIJJI = z;
    }

    public static final void onCheckedChanged$2(IDCListenerS202S0100000_1 iDCListenerS202S0100000_1, CompoundButton compoundButton, boolean z) {
        ((C107404Jk) iDCListenerS202S0100000_1.l0).LIZJ(z);
        ((C107404Jk) iDCListenerS202S0100000_1.l0).getClass();
        C107404Jk.LIZIZ(z);
        ((C107404Jk) iDCListenerS202S0100000_1.l0).LJIIJJI = z;
    }

    public static final void onCheckedChanged$3(IDCListenerS202S0100000_1 iDCListenerS202S0100000_1, CompoundButton compoundButton, boolean z) {
        C784636c c784636c = ((FriendChatDetailActivity) iDCListenerS202S0100000_1.l0).LLFFF;
        if (c784636c != null && z != c784636c.LJLILLLLZI.isBlock()) {
            c784636c.LJI();
        }
    }

    public static final void onCheckedChanged$4(IDCListenerS202S0100000_1 iDCListenerS202S0100000_1, CompoundButton compoundButton, boolean z) {
        ((InterfaceC88472Yns) iDCListenerS202S0100000_1.l0).invoke(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$5(IDCListenerS202S0100000_1 iDCListenerS202S0100000_1, CompoundButton compoundButton, boolean z) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) ((InterfaceC24760y8) iDCListenerS202S0100000_1.l0).getValue();
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(z));
        }
    }

    public static final void onCheckedChanged$6(IDCListenerS202S0100000_1 iDCListenerS202S0100000_1, CompoundButton compoundButton, boolean z) {
        ((InterfaceC88472Yns) iDCListenerS202S0100000_1.l0).invoke(Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Boolean] */
    public static final void onCheckedChanged$7(IDCListenerS202S0100000_1 iDCListenerS202S0100000_1, CompoundButton compoundButton, boolean z) {
        ((C68322mC) iDCListenerS202S0100000_1.l0).element = Boolean.valueOf(z);
    }

    public static final void onCheckedChanged$8(IDCListenerS202S0100000_1 iDCListenerS202S0100000_1, CompoundButton compoundButton, boolean z) {
        if (z) {
            View _$_findCachedViewById = ((VideoCreationTailFragment) iDCListenerS202S0100000_1.l0)._$_findCachedViewById(R.id.w5);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(0);
            }
            View _$_findCachedViewById2 = ((VideoCreationTailFragment) iDCListenerS202S0100000_1.l0)._$_findCachedViewById(R.id.kgt);
            if (_$_findCachedViewById2 == null) {
                return;
            }
            _$_findCachedViewById2.setVisibility(8);
            return;
        }
        View _$_findCachedViewById3 = ((VideoCreationTailFragment) iDCListenerS202S0100000_1.l0)._$_findCachedViewById(R.id.w5);
        if (_$_findCachedViewById3 != null) {
            _$_findCachedViewById3.setVisibility(8);
        }
        View _$_findCachedViewById4 = ((VideoCreationTailFragment) iDCListenerS202S0100000_1.l0)._$_findCachedViewById(R.id.kgt);
        if (_$_findCachedViewById4 == null) {
            return;
        }
        _$_findCachedViewById4.setVisibility(0);
    }
}
