package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.7BR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7BR extends FrameLayout {
    public final TuxTextView LJLIL;
    public Aweme LJLILLLLZI;
    public C1811278y LJLJI;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C42625Go9.LIZIZ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C42625Go9.LIZJ(this);
    }

    public final boolean LIZ(Aweme aweme) {
        InteractionTagUserInfo interactionTagUserInfo;
        int i;
        InteractionTagInfo interactionTagInfo;
        List<InteractionTagUserInfo> taggedUsers;
        InteractionTagInfo interactionTagInfo2;
        List<InteractionTagUserInfo> taggedUsers2;
        this.LJLILLLLZI = aweme;
        if (aweme != null && (interactionTagInfo2 = aweme.getInteractionTagInfo()) != null && (taggedUsers2 = interactionTagInfo2.getTaggedUsers()) != null) {
            interactionTagUserInfo = (InteractionTagUserInfo) ORZ.LJLLLL(taggedUsers2);
        } else {
            interactionTagUserInfo = null;
        }
        if (aweme != null && (interactionTagInfo = aweme.getInteractionTagInfo()) != null && (taggedUsers = interactionTagInfo.getTaggedUsers()) != null) {
            i = taggedUsers.size();
        } else {
            i = 0;
        }
        if (C7F0.LIZ() || C186997Vn.LIZIZ()) {
            C78886Uxe.LJJLIIIJJI(this);
            if (interactionTagUserInfo == null) {
                C78886Uxe.LJJLIIIJILLIZJL(this);
                return false;
            }
            C78886Uxe.LJJLIIIJJI(this);
            String str = "";
            if (i > 1) {
                TuxTextView tuxTextView = this.LJLIL;
                String string = getContext().getResources().getString(R.string.s1y);
                o.LJIIIIZZ(string, "context.resources.getStr…_feed_label_with_n_ppl_2)");
                C025908h.LJ(new Object[]{"", Integer.valueOf(i)}, 2, string, "format(format, *args)", tuxTextView);
            } else {
                TuxTextView tuxTextView2 = this.LJLIL;
                String uniqueId = interactionTagUserInfo.getUniqueId();
                if (uniqueId != null) {
                    str = uniqueId;
                }
                tuxTextView2.setText(str);
            }
            return true;
        }
        C78886Uxe.LJJLIIIJILLIZJL(this);
        return false;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onInteractionTagInfoEvent(InteractionTagInfoEvent interactionTagInfoEvent) {
        if (interactionTagInfoEvent == null) {
            return;
        }
        LIZ(interactionTagInfoEvent.aweme);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7BR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        FrameLayout.inflate(context, R.layout.p6, this);
        View findViewById = findViewById(R.id.l0q);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tagged_people_desc)");
        this.LJLIL = (TuxTextView) findViewById;
    }
}
