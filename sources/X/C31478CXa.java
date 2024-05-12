package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.CXa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31478CXa extends FrameLayout implements InterfaceC76931UHf {
    public final RecyclerView LJLIL;
    public C32503CpH LJLILLLLZI;

    @Override // X.InterfaceC76931UHf
    public final boolean LJIL(int i) {
        return true;
    }

    @Override // X.InterfaceC76931UHf
    public final boolean LJJLIL() {
        return true;
    }

    public final C32503CpH getAdapter() {
        return this.LJLILLLLZI;
    }

    public final void setAdapter(C32503CpH c32503CpH) {
        this.LJLILLLLZI = c32503CpH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31478CXa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        FrameLayout.inflate(context, R.layout.doy, this);
        View findViewById = findViewById(R.id.bi8);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.color_indicator)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.LJLIL = recyclerView;
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(context, R.anim.gr));
        C32503CpH c32503CpH = new C32503CpH();
        this.LJLILLLLZI = c32503CpH;
        recyclerView.setAdapter(c32503CpH);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        o.LJIIIZ(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (i == 0) {
            this.LJLIL.scheduleLayoutAnimation();
        }
    }
}
