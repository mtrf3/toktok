package X;

import Y.ACListenerS29S0100000_9;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MX9 extends RecyclerView.ViewHolder {
    public final View LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MX9(View view, UrlModel urlModel, String str, String str2, InterfaceC65784Pro<C76800UCe> listner) {
        super(view);
        o.LJIIIZ(listner, "listner");
        this.LJLIL = view;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 413));
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS159S0100000_9(this, 414));
        if (urlModel != null) {
            C78765Uvh.LJFF((C62846OlW) LIZIZ.getValue(), urlModel);
        } else if (str != null) {
            C78765Uvh.LJIIIZ((C62846OlW) LIZIZ.getValue(), str, -1, -1);
        }
        C16880lQ.LJJJJJL((C62846OlW) LIZIZ.getValue(), new ACListenerS29S0100000_9(listner, 39));
        if (!TextUtils.isEmpty(str2)) {
            ((View) LIZIZ2.getValue()).setVisibility(0);
            ((TextView) LIZIZ2.getValue()).setText(str2);
            C118824lS.LIZJ((TextView) LIZIZ2.getValue(), null);
        }
        if (C53341Kwb.LIZ()) {
            MVR.LIZ((View) LIZIZ.getValue(), MVP.AVATAR, C32151Nz.LJIIZILJ(2));
        }
    }
}
