package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.8WT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8WT extends FrameLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public C70R LJLJJI;
    public C8WV LJLJJL;

    public final SYL getMentionList() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-mentionList>(...)");
        return (SYL) value;
    }

    public final C212808Wu getMentionSearchLayout() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-mentionSearchLayout>(...)");
        return (C212808Wu) value;
    }

    public final C73305Spp getStatusView() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIJ(this);
        }
    }

    public final C70R getCommentMentionConfig() {
        return this.LJLJJI;
    }

    public final C8WV getItemActionListener() {
        return this.LJLJJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8WT(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1619));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1620));
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1618));
        C16880lQ.LLLZIIL(R.layout.bs7, C16880lQ.LLZIL(context), this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCommentMentionItemClickEvent(C8WU c8wu) {
        if (c8wu == null) {
            return;
        }
        if (c8wu.LJLIL) {
            C8WV c8wv = this.LJLJJL;
            if (c8wv != null) {
                c8wv.LIZ(c8wu.LJLJI);
                return;
            }
            return;
        }
        C8WV c8wv2 = this.LJLJJL;
        if (c8wv2 == null) {
            return;
        }
        c8wv2.LIZIZ(c8wu.LJLILLLLZI, c8wu.LJLJI, c8wu.LJLJJI);
    }

    public final void setCommentMentionConfig(C70R c70r) {
        this.LJLJJI = c70r;
    }

    public final void setItemActionListener(C8WV c8wv) {
        this.LJLJJL = c8wv;
    }
}
