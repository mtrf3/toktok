package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;

/* renamed from: X.4ht, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116614ht extends LinearLayout {
    public final List<String> LJLIL;
    public InterfaceC116624hu LJLILLLLZI;

    public final InterfaceC116624hu getEmojiRecommendationSelectListener() {
        return this.LJLILLLLZI;
    }

    public final void setEmojiRecommendationSelectListener(InterfaceC116624hu interfaceC116624hu) {
        this.LJLILLLLZI = interfaceC116624hu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C116614ht(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        List<String> LJJIJIIJI = C47261Igj.LJJIJIIJI("😍", "😂", "😳");
        this.LJLIL = LJJIJIIJI;
        LinearLayout.inflate(context, R.layout.b74, this);
        setOrientation(0);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.ctt);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.ctu);
        TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.ctv);
        tuxTextView.setText((CharSequence) ListProtector.get(LJJIJIIJI, 0));
        tuxTextView2.setText((CharSequence) ListProtector.get(LJJIJIIJI, 1));
        tuxTextView3.setText((CharSequence) ListProtector.get(LJJIJIIJI, 2));
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS21S0100000_1(this, 3));
        C16880lQ.LJJJJI(tuxTextView2, new ACListenerS21S0100000_1(this, 4));
        C16880lQ.LJJJJI(tuxTextView3, new ACListenerS21S0100000_1(this, 5));
        setOnClickListener(new ViewOnClickListenerC13880ga(new View.OnClickListener() { // from class: X.4hv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }));
    }
}
