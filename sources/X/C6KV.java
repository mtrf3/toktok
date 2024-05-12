package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordScene;
import java.util.LinkedHashMap;
import java.util.Stack;
import kotlin.jvm.internal.o;

/* renamed from: X.6KV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6KV extends RelativeLayout {
    public final ImageView LJLIL;
    public final C6KW LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public InterfaceC158616Kj LJLL;
    public final FTCEditAudioRecordScene LJLLI;

    public final void LIZ() {
        this.LJLJJL = this.LJLJI;
        this.LJLJJLL = getWidth() - this.LJLJI;
        this.LJLJL = this.LJLJJL - (this.LJLIL.getWidth() / 2);
        this.LJLJLJ = this.LJLJJLL - (this.LJLIL.getWidth() / 2);
    }

    public final void LIZLLL() {
        this.LJLILLLLZI.invalidate();
    }

    public final Stack<Point> getStack() {
        Stack<Point> stack = new Stack<>();
        stack.addAll(this.LJLILLLLZI.getMStack());
        return stack;
    }

    public final void LIZJ(int i) {
        if (i < 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.LJLIL.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (C173636rf.LIZIZ(getContext())) {
            int i2 = this.LJLJL;
            if (i < i2) {
                i = i2;
            }
            int i3 = this.LJLJLJ;
            if (i > i3) {
                i = i3;
            }
            layoutParams2.setMarginEnd(i);
        } else {
            int i4 = this.LJLJL;
            if (i < i4) {
                i = i4;
            }
            int i5 = this.LJLJLJ;
            if (i > i5) {
                i = i5;
            }
            layoutParams2.leftMargin = i;
        }
        this.LJLIL.setLayoutParams(layoutParams2);
    }

    public final void setStack(Stack<Point> s) {
        o.LJIIIZ(s, "s");
        this.LJLILLLLZI.getMStack().clear();
        if (!C79004UzY.LJJIFFI(s)) {
            this.LJLILLLLZI.getMStack().addAll(s);
        }
        LIZLLL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6KV(ActivityC45651qj activityC45651qj, FTCEditAudioRecordScene scene) {
        super(activityC45651qj);
        o.LJIIIZ(scene, "scene");
        new LinkedHashMap();
        this.LJLIL = new ImageView(activityC45651qj);
        this.LJLILLLLZI = new C6KW(activityC45651qj);
        this.LJLJJL = -1;
        this.LJLJJLL = -1;
        this.LJLJL = -1;
        this.LJLJLJ = -1;
        this.LJLJLLL = 1;
        this.LJLLI = scene;
    }

    public final void LIZIZ(float f, View view, boolean z) {
        if (this.LJLLI.isRecording()) {
            return;
        }
        LIZ();
        int i = (int) f;
        int i2 = this.LJLJL;
        if (i >= i2) {
            i2 = i;
        }
        int i3 = this.LJLJLJ;
        if (i2 > i3) {
            i2 = i3;
        }
        LIZJ(i2);
        int i4 = this.LJLJL;
        if (i < i4) {
            i = i4;
        }
        int i5 = this.LJLJLJ;
        if (i > i5) {
            i = i5;
        }
        float width = (((view.getWidth() / 2) + i) - this.LJLJI) / (this.LJLJJLL - this.LJLJJL);
        if (width > 0.99d) {
            width = 1.0f;
        }
        if (width < 0.01d) {
            width = 0.0f;
        }
        InterfaceC158616Kj interfaceC158616Kj = this.LJLL;
        if (interfaceC158616Kj != null) {
            interfaceC158616Kj.LIZ(width, z);
        }
    }
}
