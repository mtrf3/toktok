package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeUserCardRootAssem;

/* renamed from: X.Mjj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57639Mjj implements C92D {
    public final /* synthetic */ RecSwipeUserCardRootAssem LIZ;
    public final /* synthetic */ View LIZIZ;

    public C57639Mjj(RecSwipeUserCardRootAssem recSwipeUserCardRootAssem, View view) {
        this.LIZ = recSwipeUserCardRootAssem;
        this.LIZIZ = view;
    }

    @Override // X.C92D
    public final void LIZ(float f, float f2) {
        Context context = this.LIZ.getContext();
        if (context != null) {
            RecSwipeUserCardRootAssem recSwipeUserCardRootAssem = this.LIZ;
            recSwipeUserCardRootAssem.Z3().nv0(context, this.LIZIZ);
        }
    }
}
