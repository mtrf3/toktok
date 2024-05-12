package X;

import Y.ACListenerS47S0200000_13;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAudioMuteTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3AudioBeOccupiedSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Tdb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75095Tdb extends C75093TdZ {
    @Override // X.C75093TdZ
    public final int N(LinkPlayerInfo linkPlayerInfo) {
        Boolean bool;
        TZM tzm;
        if (linkPlayerInfo == null) {
            return 1;
        }
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null && (tzm = (TZM) C79004UzY.LJIL(dataChannel, TZM.class)) != null) {
            String str = linkPlayerInfo.mInteractIdStr;
            o.LJIIIIZZ(str, "item.interactId");
            bool = Boolean.valueOf(tzm.k(str));
        } else {
            bool = null;
        }
        if (!C29306Beo.LJJIFFI(bool)) {
            return 1;
        }
        return 2;
    }

    @Override // X.C75093TdZ
    public final void T(LinkPlayerInfo item) {
        Boolean bool;
        boolean z;
        TZM tzm;
        TZM tzm2;
        o.LJIIIZ(item, "item");
        if (!LiveAudioMuteTypeSetting.INSTANCE.isEnableAnchorMuteMic()) {
            super.T(item);
            return;
        }
        DataChannel dataChannel = this.LJLIL;
        Boolean bool2 = null;
        if (dataChannel != null && (tzm2 = (TZM) C79004UzY.LJIL(dataChannel, TZM.class)) != null) {
            String str = item.mInteractIdStr;
            o.LJIIIIZZ(str, "item.interactId");
            bool = Boolean.valueOf(tzm2.u(str));
        } else {
            bool = null;
        }
        boolean LJJIFFI = C29306Beo.LJJIFFI(bool);
        if (1 == MultiGuestV3AudioBeOccupiedSettings.getValue()) {
            DataChannel dataChannel2 = this.LJLIL;
            if (dataChannel2 != null && (tzm = (TZM) C79004UzY.LJIL(dataChannel2, TZM.class)) != null) {
                String str2 = item.mInteractIdStr;
                o.LJIIIIZZ(str2, "item.interactId");
                bool2 = Boolean.valueOf(tzm.LJL(str2));
            }
            z = C29306Beo.LJJIFFI(bool2);
        } else {
            z = false;
        }
        ImageView imageView = this.LLF;
        o.LJIIIZ(imageView, "<this>");
        if (imageView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(0);
            imageView.setLayoutParams(marginLayoutParams);
        }
        this.LLF.setVisibility(0);
        i0(item);
        if (1 == MultiGuestV3AudioBeOccupiedSettings.getValue()) {
            C16880lQ.LJIILLIIL(this.LLF, new ViewOnClickListenerC75113Tdt(LJJIFFI, z, this, item));
        } else if (!LJJIFFI) {
            C16880lQ.LJIILLIIL(this.LLF, new ACListenerS47S0200000_13((Object) this, (Object) item, 50));
        } else {
            this.LLF.setClickable(false);
        }
    }

    public final void i0(LinkPlayerInfo linkPlayerInfo) {
        Boolean bool;
        boolean z;
        TZM tzm;
        TZM tzm2;
        DataChannel dataChannel = this.LJLIL;
        Boolean bool2 = null;
        if (dataChannel != null && (tzm2 = (TZM) C79004UzY.LJIL(dataChannel, TZM.class)) != null) {
            String str = linkPlayerInfo.mInteractIdStr;
            o.LJIIIIZZ(str, "item.interactId");
            bool = Boolean.valueOf(tzm2.u(str));
        } else {
            bool = null;
        }
        boolean LJJIFFI = C29306Beo.LJJIFFI(bool);
        if (1 == MultiGuestV3AudioBeOccupiedSettings.getValue()) {
            DataChannel dataChannel2 = this.LJLIL;
            if (dataChannel2 != null && (tzm = (TZM) C79004UzY.LJIL(dataChannel2, TZM.class)) != null) {
                String str2 = linkPlayerInfo.mInteractIdStr;
                o.LJIIIIZZ(str2, "item.interactId");
                bool2 = Boolean.valueOf(tzm.LJL(str2));
            }
            z = C29306Beo.LJJIFFI(bool2);
        } else {
            z = false;
        }
        C74947TbD.LJJIII(this.LLF, N(linkPlayerInfo), this.LLIIIL, LJJIFFI, z);
    }

    @Override // X.C75093TdZ
    public final void U(LinkPlayerInfo item, C75054Tcw c75054Tcw) {
        Boolean bool;
        boolean z;
        TZM tzm;
        TZM tzm2;
        o.LJIIIZ(item, "item");
        if (item.mUser == null) {
            return;
        }
        DataChannel dataChannel = this.LJLIL;
        Boolean bool2 = null;
        if (dataChannel != null && (tzm2 = (TZM) C79004UzY.LJIL(dataChannel, TZM.class)) != null) {
            String str = item.mInteractIdStr;
            o.LJIIIIZZ(str, "item.interactId");
            bool = Boolean.valueOf(tzm2.u(str));
        } else {
            bool = null;
        }
        boolean LJJIFFI = C29306Beo.LJJIFFI(bool);
        if (1 == MultiGuestV3AudioBeOccupiedSettings.getValue()) {
            DataChannel dataChannel2 = this.LJLIL;
            if (dataChannel2 != null && (tzm = (TZM) C79004UzY.LJIL(dataChannel2, TZM.class)) != null) {
                String str2 = item.mInteractIdStr;
                o.LJIIIIZZ(str2, "item.interactId");
                bool2 = Boolean.valueOf(tzm.LJL(str2));
            }
            z = C29306Beo.LJJIFFI(bool2);
        } else {
            z = false;
        }
        c75054Tcw.LIZIZ = V(item, LJJIFFI, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75095Tdb(View itemView, DataChannel dataChannel, InterfaceC75119Tdz interfaceC75119Tdz, MultiGuestDataHolder dataHolder, LinkControlDataHolder linkControlDataHolder, int i) {
        super(itemView, dataChannel, interfaceC75119Tdz, dataHolder, linkControlDataHolder, i, null, null, null, null);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(dataHolder, "dataHolder");
    }
}
