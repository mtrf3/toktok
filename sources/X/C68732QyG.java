package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.QyG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68732QyG implements InterfaceC68733QyH {
    public final /* synthetic */ FrameLayout LIZ;
    public final /* synthetic */ LayoutInflater LIZIZ;
    public final /* synthetic */ ViewGroup LIZJ;
    public final /* synthetic */ Bundle LIZLLL;
    public final /* synthetic */ AbstractC68731QyF LJ;

    public C68732QyG(AbstractC68731QyF abstractC68731QyF, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.LJ = abstractC68731QyF;
        this.LIZ = frameLayout;
        this.LIZIZ = layoutInflater;
        this.LIZJ = viewGroup;
        this.LIZLLL = bundle;
    }

    @Override // X.InterfaceC68733QyH
    public final int LIZIZ() {
        return 2;
    }

    @Override // X.InterfaceC68733QyH
    public final void LIZ() {
        this.LIZ.removeAllViews();
        this.LIZ.addView(this.LJ.LIZ.onCreateView(this.LIZIZ, this.LIZJ, this.LIZLLL));
    }
}
