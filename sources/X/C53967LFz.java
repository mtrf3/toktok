package X;

import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.friendstab.model.ToolBarIconModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import defpackage.g0;
import kotlin.jvm.internal.o;

/* renamed from: X.LFz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53967LFz extends ConstraintLayout implements LGH {
    public static final int LJLJJL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(44));
    public static final int LJLJJLL = C7MY.LIZIZ(36);
    public static final int LJLJL = (int) g0.LJIJJ(28);
    public static final int LJLJLJ = (int) g0.LJIJJ(24);
    public View LJLIL;
    public TuxIconView LJLILLLLZI;
    public AVS LJLJI;
    public ToolBarIconModel LJLJJI;

    @Override // X.LGH
    public final void LLLIILIL() {
        View view;
        ToolBarIconModel toolBarIconModel = this.LJLJJI;
        if ((toolBarIconModel == null || toolBarIconModel.getHasDot()) && (view = this.LJLIL) != null) {
            C17N.LJJLIIIJJI(view);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53967LFz(Context context) {
        this(context, null);
        o.LJIIIZ(context, "context");
    }

    private final void setIconViewByModel(ToolBarIconModel toolBarIconModel) {
        int i;
        if (toolBarIconModel.getType() == EnumC53733L6z.SEARCH && C53219Kud.LIZ) {
            i = LJLJLJ;
        } else {
            i = LJLJL;
        }
        TuxIconView tuxIconView = this.LJLILLLLZI;
        if (tuxIconView != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = toolBarIconModel.getIconRes();
            c2068389v.LJ = Integer.valueOf(toolBarIconModel.getTintColor());
            c2068389v.LIZIZ = i;
            c2068389v.LIZJ = i;
            c2068389v.LJFF = true;
            tuxIconView.setTuxIcon(c2068389v);
        }
    }

    @Override // X.LGH
    public final void LJJLJ(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    @Override // X.LGH
    public void setIconModel(ToolBarIconModel model) {
        o.LJIIIZ(model, "model");
        this.LJLJJI = model;
        setIconViewByModel(model);
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS29S0100000_9(this, 80)));
        if (!model.getHasDot()) {
            View view = this.LJLIL;
            if (view != null) {
                C17N.LJJIIJZLJL(view);
            }
            AVS avs = this.LJLJI;
            if (avs != null) {
                C17N.LJJIIJZLJL(avs);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53967LFz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        a1.LJFF(context, "context");
        if (C53219Kud.LIZ) {
            i = LJLJJL;
        } else {
            i = LJLJJLL;
        }
        C16880lQ.LLLZIIL(R.layout.cmx, C16880lQ.LLZIL(context), this);
        this.LJLIL = findViewById(R.id.eb_);
        this.LJLILLLLZI = (TuxIconView) findViewById(R.id.eb7);
        this.LJLJI = (AVS) findViewById(R.id.afw);
        TuxIconView tuxIconView = this.LJLILLLLZI;
        if (tuxIconView != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            layoutParams.height = i;
            layoutParams.width = i;
            tuxIconView.setLayoutParams(layoutParams);
        }
    }
}
