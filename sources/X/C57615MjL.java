package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeUserCardRootAssem;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.MjL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57615MjL extends AbstractC65781Prl implements InterfaceC88471Ynr<RecSwipeUserCardRootAssem, RecUser, C76800UCe> {
    public static final C57615MjL LJLIL = new C57615MjL();

    public C57615MjL() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(RecSwipeUserCardRootAssem recSwipeUserCardRootAssem, RecUser recUser) {
        GradientDrawable gradientDrawable;
        RecSwipeUserCardRootAssem selectSubscribe = recSwipeUserCardRootAssem;
        RecUser recUser2 = recUser;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (recUser2 != null) {
            if (C57626MjW.LIZIZ()) {
                View _$_findCachedViewById = selectSubscribe._$_findCachedViewById(R.id.j76);
                RecSwipeViewModel Z3 = selectSubscribe.Z3();
                Z3.getClass();
                C57688MkW c57688MkW = (C57688MkW) Z3.LJLLI.getValue();
                c57688MkW.getClass();
                OSZ LJI = OQN.LJI(recUser2);
                if (LJI == null) {
                    C221018lt.LIZ("RecSwipeFlyMainColorManager", "url is null");
                    gradientDrawable = C57688MkW.LIZJ;
                } else {
                    String str = (String) LJI.getFirst();
                    String str2 = (String) LJI.getSecond();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("getBackgroundDrawable: url=");
                    LIZ.append(str);
                    LIZ.append(", tag=");
                    LIZ.append(str2);
                    C221018lt.LIZ("RecSwipeFlyMainColorManager", X1D.LIZIZ(LIZ));
                    int[] iArr = c57688MkW.LIZIZ.get(str);
                    if (iArr == null) {
                        gradientDrawable = C57688MkW.LIZJ;
                    } else {
                        gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
                        gradientDrawable.setCornerRadius(0.0f);
                    }
                }
                _$_findCachedViewById.setBackground(gradientDrawable);
            } else {
                selectSubscribe._$_findCachedViewById(R.id.j76).setBackgroundResource(R.drawable.a17);
            }
        }
        return C76800UCe.LIZ;
    }
}
