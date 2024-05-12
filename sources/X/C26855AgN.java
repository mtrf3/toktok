package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AgN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26855AgN extends ClickableSpan {
    public final /* synthetic */ LinkText LJLIL;
    public final /* synthetic */ TuxTextView LJLILLLLZI;
    public final /* synthetic */ C27021Aj3 LJLJI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        AddressEditFragment addressEditFragment;
        o.LJIIIZ(widget, "widget");
        String str = this.LJLIL.link;
        if (str == null) {
            str = "";
        }
        Uri.Builder LIZJ = C26867AgZ.LIZJ(str, C113554cx.LJJJLIIL());
        IBulletService LIZ = BulletService.LIZ();
        Context context = this.LJLILLLLZI.getContext();
        o.LJIIIIZZ(context, "tuxTextView.context");
        String uri = LIZJ.build().toString();
        o.LJIIIIZZ(uri, "uri.build().toString()");
        LIZ.LJIIIIZZ(context, uri);
        if (o.LJ(this.LJLJI.LIZ.key, "notice") && (addressEditFragment = AddressEditFragment.LLD) != null) {
            C78946Uyc.LJJII(addressEditFragment, new C70917RsP(), C26856AgO.LJLIL);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        Context context = this.LJLILLLLZI.getContext();
        o.LJIIIIZZ(context, "tuxTextView.context");
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
        ds.setAlpha(191);
        ds.setUnderlineText(false);
    }

    public C26855AgN(LinkText linkText, TuxTextView tuxTextView, C27021Aj3 c27021Aj3) {
        this.LJLIL = linkText;
        this.LJLILLLLZI = tuxTextView;
        this.LJLJI = c27021Aj3;
    }
}
