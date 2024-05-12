package X;

import Y.ACListenerS33S0100000_13;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3RemindStyle;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Td3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75061Td3 extends AbstractC76218Tvi<C75057Tcz> {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final ViewGroup LJLJI;
    public final TextView LJLJJI;
    public final TextView LJLJJL;
    public final ImageView LJLJJLL;
    public final TextView LJLJL;

    @Override // X.AbstractC76218Tvi
    public final void L(int i, Object obj) {
        C75057Tcz data = (C75057Tcz) obj;
        o.LJIIIZ(data, "data");
        C75060Td2 invoke = data.LJLJI.invoke();
        if (invoke == null || invoke.LJLIL.length() == 0 || (MultiGuestV3RemindStyle.INSTANCE.getValue() == 1 && ujb.o.LJJJJIZL(invoke.LJLIL, CardStruct.IStatusCode.DEFAULT, true))) {
            ViewGroup viewGroup = this.LJLJI;
            if (viewGroup != null) {
                C115524g8 c115524g8 = new C115524g8(OJ4.LJJJJ(C78924UyG.LIZLLL(viewGroup), C2N8.LJLIL));
                while (c115524g8.hasNext()) {
                    ((View) c115524g8.next()).setVisibility(8);
                }
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LJLJI;
        if (viewGroup2 != null) {
            C115524g8 c115524g82 = new C115524g8(OJ4.LJJJJ(C78924UyG.LIZLLL(viewGroup2), C2N7.LJLIL));
            while (c115524g82.hasNext()) {
                ((View) c115524g82.next()).setVisibility(0);
            }
        }
        TextView textView = this.LJLJJI;
        if (textView != null) {
            textView.setText(invoke.LJLIL);
        }
        TextView textView2 = this.LJLJJL;
        if (textView2 != null) {
            textView2.setText(":");
        }
        if (!data.LJLILLLLZI || MultiGuestV3RemindStyle.INSTANCE.getValue() == 3) {
            TextView textView3 = this.LJLJL;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            TextView textView4 = this.LJLJL;
            if (textView4 != null) {
                textView4.setText(invoke.LJLJI);
            }
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        } else {
            TextView textView5 = this.LJLJL;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
        }
        ImageView imageView = this.LJLJJLL;
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, new ACListenerS33S0100000_13(this, 128));
        }
    }

    public C75061Td3(View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(view);
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = interfaceC65784Pro2;
        this.LJLJI = (ViewGroup) view.findViewById(R.id.dzw);
        this.LJLJJI = (TextView) view.findViewById(R.id.e02);
        this.LJLJJL = (TextView) view.findViewById(R.id.dzy);
        this.LJLJJLL = (ImageView) view.findViewById(R.id.e03);
        this.LJLJL = (TextView) view.findViewById(R.id.dzz);
    }
}
