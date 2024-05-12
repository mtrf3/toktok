package com.bytedance.android.livesdk.browser.emote;

import X.C0K2;
import X.C16880lQ;
import X.C28507BGt;
import X.C41081jM;
import X.C47121t6;
import X.C51029K0z;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import X.SY4;
import X.UGO;
import Y.ACListenerS33S0100000_13;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.event.SwitchCameraChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CropEmoteFragment extends LiveDialogFragment {
    public static final /* synthetic */ int LJLJLJ = 0;
    public Uri LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public Bitmap LJLJJI;
    public InterfaceC88471Ynr<? super String, ? super Integer, C76800UCe> LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public long LJLJJL = Long.MIN_VALUE;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.d3q);
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LJLJJL == Long.MIN_VALUE) {
            return;
        }
        C0K2.LJIIIZ(0, SystemClock.elapsedRealtime() - this.LJLJJL, "ttlive_crop_fragment_all");
        this.LJLJJL = Long.MIN_VALUE;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.rv0(SwitchCameraChannel.class, Boolean.FALSE);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJLIL = (Uri) arguments.getParcelable("arg_origin_uri");
            this.LJLILLLLZI = arguments.getString("arg_origin_path");
            this.LJLJI = arguments.getString("arg_origin_data");
            this.LJLJJI = (Bitmap) arguments.getParcelable("arg_origin_bitmap");
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.rv0(SwitchCameraChannel.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        UGO ugo = (UGO) _$_findCachedViewById(R.id.cuy);
        String str = this.LJLILLLLZI;
        if (str != null) {
            ugo.setOriginPath(str);
        } else {
            Uri uri = this.LJLIL;
            if (uri != null) {
                ugo.setOriginUri(uri);
            } else {
                String str2 = this.LJLJI;
                if (str2 != null) {
                    ugo.setOriginData(str2);
                } else {
                    Bitmap bitmap = this.LJLJJI;
                    if (bitmap != null) {
                        ugo.setOriginBitmap(bitmap);
                    }
                }
            }
        }
        C16880lQ.LJJIIZI((C41081jM) _$_findCachedViewById(R.id.ezq), new ACListenerS33S0100000_13(this, 63));
        C16880lQ.LJJIIZI((C41081jM) _$_findCachedViewById(R.id.f1j), new ACListenerS33S0100000_13(this, 64));
        ((TextView) _$_findCachedViewById(R.id.l1n)).setText("Done");
        C16880lQ.LJJIIZ((C47121t6) _$_findCachedViewById(R.id.mho), new ACListenerS33S0100000_13(this, 65));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.l1n), new ACListenerS33S0100000_13(this, 66));
        C16880lQ.LJJIIZI((C41081jM) _$_findCachedViewById(R.id.f_a), new ACListenerS33S0100000_13(this, 67));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        o.LJIIIZ(manager, "manager");
        this.LJLJJL = SystemClock.elapsedRealtime();
        super.show(manager, str);
    }
}
