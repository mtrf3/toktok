package com.bytedance.android.livesdk.qa;

import X.BV1;
import X.C05170If;
import X.C0K2;
import X.C113554cx;
import X.C15380j0;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C1DH;
import X.C28507BGt;
import X.C28860BUi;
import X.C28863BUl;
import X.C29306Beo;
import X.C29927Bop;
import X.C73318Sq2;
import X.C73943T0h;
import X.CXJ;
import X.EnumC29609Bjh;
import X.EnumC30204BtI;
import X.EnumC31509CYf;
import X.OSZ;
import Y.ACListenerS25S0100000_5;
import Y.ACListenerS32S0110000_5;
import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Spannable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.BroadcastEndShowEvent;
import com.bytedance.android.live.qa.QuestionDialogVisibilityChannel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.android.livesdk.dataChannel.RefreshMoreRedDotEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.message.BottomMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class QADialog extends LiveDialogFragment implements OnMessageListener {
    public C73318Sq2 LJLIL;
    public boolean LJLILLLLZI;
    public ARunnableS41S0100000_5 LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public String LJLJI = "";

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d02);
        c28507BGt.LIZIZ = 0;
        c28507BGt.LIZJ = R.style.ab4;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJJI = 60;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        IMessageManager iMessageManager;
        super.onDestroyView();
        View view = getView();
        if (view != null) {
            view.removeCallbacks(this.LJLJJI);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(this);
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final EnumC29609Bjh getPanelType() {
        return EnumC29609Bjh.PANEL_QA;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(QuestionDialogVisibilityChannel.class, Boolean.FALSE);
        }
        C73318Sq2 c73318Sq2 = this.LJLIL;
        if (c73318Sq2 != null) {
            c73318Sq2.LIZLLL();
        }
        if (this.LJLILLLLZI) {
            EnumC30204BtI.INTERACTION_FEATURES.hideRedDot(this.dataChannel);
            DataChannel dataChannel2 = this.dataChannel;
            BV1.LIZ = 0;
            if (dataChannel2 != null) {
                dataChannel2.pv0(RefreshMoreRedDotEvent.class);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        BottomMessage bottomMessage;
        if ((iMessage instanceof BottomMessage) && (bottomMessage = (BottomMessage) iMessage) != null) {
            Spannable LJFF = CXJ.LJFF(bottomMessage.baseMessage.displayText, "");
            if (C29306Beo.LJIJJLI(LJFF) && LJFF != null) {
                View view = getView();
                if (view != null) {
                    view.removeCallbacks(this.LJLJJI);
                }
                View _$_findCachedViewById = _$_findCachedViewById(R.id.nh1);
                if (_$_findCachedViewById != null) {
                    C29306Beo.LJJLJLI(_$_findCachedViewById);
                }
                TextView textView = (TextView) _$_findCachedViewById(R.id.nh2);
                if (textView != null) {
                    textView.setText(LJFF);
                }
                this.LJLJJI = new ARunnableS41S0100000_5(this, 182);
                View view2 = getView();
                if (view2 != null) {
                    view2.postDelayed(this.LJLJJI, TimeUnit.SECONDS.toMillis(bottomMessage.duration));
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Room room;
        View _$_findCachedViewById;
        boolean z;
        IMessageManager iMessageManager;
        User user;
        Boolean bool;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        LIZ.LJIIIIZZ(R.id.ih3, 1, new QAFragment(), "QAFragment");
        LIZ.LJIILJJIL();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (str = (String) dataChannel.kv0(C28863BUl.class)) == null) {
            str = "";
        }
        this.LJLJI = str;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (room = (Room) dataChannel2.kv0(RoomChannel.class)) == null) {
            return;
        }
        boolean LJ = o.LJ(this.LJLJI, "interaction_feature");
        if (LJ) {
            _$_findCachedViewById = _$_findCachedViewById(R.id.aeo);
        } else {
            _$_findCachedViewById = _$_findCachedViewById(R.id.bfj);
        }
        ImageView imageView = (ImageView) _$_findCachedViewById;
        C29306Beo.LJJLJLI(imageView);
        C16880lQ.LJIILLIIL(imageView, new ACListenerS32S0110000_5(this, LJ, 1));
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (bool = (Boolean) dataChannel3.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null && (user = (User) dataChannel4.kv0(RoomUserChannel.class)) != null) {
            user.getUserAttr();
        }
        if (!this.LJLILLLLZI) {
            _$_findCachedViewById(R.id.bfj).setLayoutParams(_$_findCachedViewById(R.id.gm2).getLayoutParams());
            C29306Beo.LJI(_$_findCachedViewById(R.id.gm2));
            ((TextView) _$_findCachedViewById(R.id.las)).setText(C15380j0.LJIILL(R.string.mt_, C05170If.LIZ(room.getOwner())));
            C73318Sq2 c73318Sq2 = new C73318Sq2();
            c73318Sq2.LIZ(C73943T0h.LIZ().LJ(C28860BUi.class).LJJJJZI(new AfS57S0100000_5(this, 245)));
            this.LJLIL = c73318Sq2;
            DataChannel dataChannel5 = this.dataChannel;
            if (dataChannel5 != null) {
                dataChannel5.lv0(this, LiveEndDismissDialogEvent.class, new AqS171S0100000_5(this, 671));
            }
            C0K2.LJII(0, "live_Q&A_audicence_show", C113554cx.LJJJLZIJ(new OSZ("isQAOPen", Boolean.valueOf(C1DH.LJJIIJZLJL(this.dataChannel))), new OSZ("isQAReducedVersion", Boolean.valueOf(BV1.LJFF(this.dataChannel)))));
        } else {
            ((TextView) _$_findCachedViewById(R.id.las)).setText(C15380j0.LJIILJJIL(R.string.msk));
            DataChannel dataChannel6 = this.dataChannel;
            if (dataChannel6 != null) {
                dataChannel6.lv0(this, BroadcastEndShowEvent.class, new AqS171S0100000_5(this, 673));
            }
            DataChannel dataChannel7 = this.dataChannel;
            if (dataChannel7 != null) {
                dataChannel7.lv0(this, CurrentQuestionChannel.class, new AqS171S0100000_5(this, 675));
            }
            DataChannel dataChannel8 = this.dataChannel;
            if (dataChannel8 != null) {
                dataChannel8.lv0(this, AnchorSwitchQuestionEvent.class, new AqS171S0100000_5(this, 676));
            }
        }
        if (!BV1.LJIIIZ(this.dataChannel)) {
            ((TextView) _$_findCachedViewById(R.id.las)).setText(C15380j0.LJIILJJIL(R.string.ng3));
            _$_findCachedViewById(R.id.cdx).setVisibility(0);
        }
        C16880lQ.LJIILLIIL((ImageView) _$_findCachedViewById(R.id.gm2), new ACListenerS25S0100000_5(this, 301));
        DataChannel dataChannel9 = this.dataChannel;
        if (dataChannel9 == null || (iMessageManager = (IMessageManager) dataChannel9.kv0(C29927Bop.class)) == null) {
            return;
        }
        iMessageManager.addMessageListener(EnumC31509CYf.BOTTOM_MESSAGE.getIntType(), this);
    }
}
