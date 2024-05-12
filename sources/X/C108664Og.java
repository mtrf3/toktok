package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Og, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108664Og extends LinearLayout {
    public final SharePanelViewModel LJLIL;
    public final C119624mk LJLILLLLZI;
    public IMContact LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C108664Og(Context context, SharePanelViewModel sharePanelViewModel) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLIL = sharePanelViewModel;
        View.inflate(context, R.layout.b9v, this);
        o.LJIIIIZZ(findViewById(R.id.eus), "findViewById(R.id.item_root_container)");
        o.LJIIIIZZ(findViewById(R.id.gw7), "findViewById(R.id.name_tv)");
        View findViewById = findViewById(R.id.acf);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.avatar_iv)");
        C119624mk c119624mk = (C119624mk) findViewById;
        this.LJLILLLLZI = c119624mk;
        C16880lQ.LJJJJIZL(c119624mk, new ACListenerS21S0100000_1(new AqS167S0100000_1(this, 498), 268));
    }
}
