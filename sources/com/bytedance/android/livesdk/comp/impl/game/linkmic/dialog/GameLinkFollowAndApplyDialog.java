package com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog;

import X.B83;
import X.C05170If;
import X.C0YH;
import X.C16880lQ;
import X.C28507BGt;
import X.C29044Baa;
import X.C29374Bfu;
import X.C2A7;
import X.C31665Cbl;
import X.InterfaceC05190Ih;
import X.InterfaceC29405BgP;
import Y.ACListenerS33S0100000_13;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.room.LiveEndEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.CheckPermissionSucc;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class GameLinkFollowAndApplyDialog extends LiveDialogFragment {
    public C2A7 LJLIL;
    public Companion.OnFollowRequestListener LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    /* loaded from: classes14.dex */
    public static final class Companion {

        /* loaded from: classes14.dex */
        public interface OnFollowRequestListener extends Parcelable {
            void LJJIIZI(boolean z);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cx2);
        c28507BGt.LIZJ = R.style.ac_;
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        Companion.OnFollowRequestListener onFollowRequestListener = this.LJLILLLLZI;
        if (onFollowRequestListener != null) {
            onFollowRequestListener.LJJIIZI(false);
        }
        return super.onBackPressed();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        Companion.OnFollowRequestListener onFollowRequestListener;
        String str;
        String LJ;
        InterfaceC05190Ih interfaceC05190Ih;
        User LJ2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            obj = C16880lQ.LLJJIII(arguments, "OnLinkMicBuiltListener");
        } else {
            obj = null;
        }
        if (obj instanceof Companion.OnFollowRequestListener) {
            onFollowRequestListener = (Companion.OnFollowRequestListener) obj;
        } else {
            onFollowRequestListener = null;
        }
        this.LJLILLLLZI = onFollowRequestListener;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            dismiss();
            return;
        }
        View findViewById = view.findViewById(R.id.ftk);
        o.LJIIIIZZ(findViewById, "view.findViewById<LiveTextView>(R.id.link_title)");
        TextView textView = (TextView) findViewById;
        String LIZJ = C05170If.LIZJ(room.getOwner());
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ == null || (LJ2 = ((C29374Bfu) LIZIZ).LJ()) == null || (str = C05170If.LIZJ(LJ2)) == null) {
            str = "";
        }
        if (!C0YH.LIZ(getContext())) {
            LJ = a1.LJ(LIZJ, " & ", str);
        } else {
            LJ = a1.LJ(str, " & ", LIZJ);
        }
        textView.setText(LJ);
        ImageView imageView = (ImageView) view.findViewById(R.id.a1p);
        User owner = room.getOwner();
        if (owner != null) {
            C31665Cbl.LJIIJ(imageView, owner.getAvatarThumb(), imageView.getWidth(), imageView.getHeight(), R.drawable.cuk);
        }
        ImageView imageView2 = (ImageView) view.findViewById(R.id.dzi);
        InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
        if (LIZIZ2 != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ2).LIZIZ) != null) {
            C31665Cbl.LJIIJ(imageView2, interfaceC05190Ih.getAvatarThumb(), imageView2.getWidth(), imageView2.getHeight(), R.drawable.cuk);
        }
        C2A7 c2a7 = (C2A7) view.findViewById(R.id.fta);
        if (c2a7 != null) {
            this.LJLIL = c2a7;
            C16880lQ.LJJIII(c2a7, new ACListenerS33S0100000_13(this, 68));
        }
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 69), view);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, CheckPermissionSucc.class, new AqS179S0100000_13(this, 276));
            dataChannel.lv0(this, LiveEndEvent.class, new AqS179S0100000_13(this, 277));
        }
    }
}
