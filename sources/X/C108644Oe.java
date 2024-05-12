package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Oe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108644Oe extends LinearLayout {
    public final SharePanelViewModel LJLIL;
    public final C4OT LJLILLLLZI;
    public final TextView LJLJI;
    public final SmartAvatarImageView LJLJJI;
    public IMContact LJLJJL;

    private final void setName(IMContact iMContact) {
        TextView textView = this.LJLJI;
        String displayName = iMContact.getDisplayName();
        if (displayName == null) {
            displayName = C45804HyK.LJJLJ("");
        }
        textView.setText(displayName);
    }

    public final void LIZ(IMContact contact) {
        o.LJIIIZ(contact, "contact");
        this.LJLJJL = contact;
        setName(contact);
        W5F LJII = W5U.LJII(C78939UyV.LJ(contact.getDisplayAvatar()));
        LJII.LJJIJIIJIL = true;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        LJII.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cf, context);
        LJII.LJJIIJ = this.LJLJJI;
        C16880lQ.LLJJJ(LJII);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C108644Oe(Context context, SharePanelViewModel sharePanelViewModel, C4OT c4ot) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLIL = sharePanelViewModel;
        this.LJLILLLLZI = c4ot;
        View.inflate(context, R.layout.b9u, this);
        o.LJIIIIZZ(findViewById(R.id.eus), "findViewById(R.id.item_root_container)");
        View findViewById = findViewById(R.id.gw7);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.name_tv)");
        this.LJLJI = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.acf);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.avatar_iv)");
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) findViewById2;
        this.LJLJJI = smartAvatarImageView;
        C16880lQ.LJJJJL(smartAvatarImageView, new ACListenerS21S0100000_1(new AqS167S0100000_1(this, 497), 266));
    }
}
