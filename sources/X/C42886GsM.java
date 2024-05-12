package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.GsM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42886GsM extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ Bundle LJLIL;
    public final /* synthetic */ Fragment LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42886GsM(int i, Activity activity, Bundle bundle, Fragment fragment, String str) {
        super(1);
        this.LJLIL = bundle;
        this.LJLILLLLZI = fragment;
        this.LJLJI = activity;
        this.LJLJJI = i;
        this.LJLJJL = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        Bundle bundle = new Bundle();
        Activity activity = this.LJLJI;
        Bundle bundle2 = this.LJLIL;
        int i = this.LJLJJI;
        String str2 = this.LJLJJL;
        bundle.putString("url", str);
        bundle.putString("title", activity.getString(R.string.eww));
        bundle.putString("enter_from", bundle2.getString("enter_from", ""));
        bundle.putString("hide_more", "false");
        bundle.putInt("ngo_id", i);
        bundle.putString("profile_uid", str2);
        bundle.putAll(this.LJLIL);
        C42884GsK.LIZ(this.LJLILLLLZI, bundle);
        return C76800UCe.LIZ;
    }
}
