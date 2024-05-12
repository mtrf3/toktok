package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.AIt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C26011AIt extends LinearLayout {
    public final AI8 LJLIL;
    public final View LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public final IAVPublishService LJLJJLL;

    public C26011AIt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void setEnable(boolean z) {
    }

    public final String getLabelText() {
        return this.LJLJJL;
    }

    public final View getMRootView() {
        return this.LJLILLLLZI;
    }

    public final String getSubtitle() {
        return this.LJLJJI;
    }

    public final AI8 getTextCell() {
        return this.LJLIL;
    }

    public final String getTitle() {
        return this.LJLJI;
    }

    public final void setLabelText(String str) {
        this.LJLJJL = str;
        AIF aif = (AIF) this.LJLIL.getAccessory();
        Objects.requireNonNull(aif);
        aif.LJIILIIL(this.LJLJJL);
    }

    public final void setLeftTuxIcon(int i) {
        C2068389v c2068389v = new C2068389v();
        if (this.LJLJJLL.isEnablePutSettingsIntoMoreOption()) {
            c2068389v.LJ = Integer.valueOf(R.attr.go);
        }
        c2068389v.LIZ = i;
        this.LJLIL.setIcon(c2068389v);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        AIF aif = new AIF(context, null);
        o.LJI(onClickListener);
        aif.LJIILJJIL(onClickListener);
        this.LJLIL.setAccessory(aif);
    }

    public final void setSubtitle(String str) {
        this.LJLJJI = str;
    }

    public final void setTitle(int i) {
        this.LJLJI = getContext().getString(i);
        if (this.LJLJJLL.isEnablePutSettingsIntoMoreOption()) {
            T5R t5r = new T5R(this.LJLJI);
            t5r.LIZ(42);
            this.LJLIL.setTitle(t5r);
            return;
        }
        this.LJLIL.setTitle(this.LJLJI);
    }

    public final void setTitle(String str) {
        this.LJLJI = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26011AIt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        new LinkedHashMap();
        this.LJLJJLL = AVExternalServiceImpl.LIZ().publishService();
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.jc, C16880lQ.LLZIL(context), this);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(R.…ublish_setting_tux, this)");
        this.LJLILLLLZI = LLLZIIL;
        View findViewById = findViewById(R.id.l3q);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.text_cell)");
        this.LJLIL = (AI8) findViewById;
    }
}
