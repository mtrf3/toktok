package X;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.ShareTextBoxViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4Nm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108464Nm {
    public final Context LIZ;
    public final View LIZIZ;
    public final SharePackage LIZJ;
    public final BaseContent LIZLLL;
    public final java.util.Map<String, String> LJ;
    public final java.util.Map<String, String> LJFF;
    public final ShareTextBoxViewModel LJI;
    public final LifecycleOwner LJII;
    public final EditText LJIIIIZZ;
    public final SY4 LJIIIZ;
    public final C62846OlW LJIIJ;
    public final TuxIconView LJIIJJI;
    public final boolean LJIIL;

    public C108464Nm(C25600zU c25600zU, View view, SharePackage sharePackage, BaseContent baseContent, java.util.Map map, java.util.Map map2, ShareTextBoxViewModel shareTextBoxViewModel, ActivityC45651qj activityC45651qj) {
        this.LIZ = c25600zU;
        this.LIZIZ = view;
        this.LIZJ = sharePackage;
        this.LIZLLL = baseContent;
        this.LJ = map;
        this.LJFF = map2;
        this.LJI = shareTextBoxViewModel;
        this.LJII = activityC45651qj;
        View findViewById = view.findViewById(R.id.cp4);
        o.LJIIIIZZ(findViewById, "layout.findViewById(R.id.edit_msg)");
        this.LJIIIIZZ = (EditText) findViewById;
        View findViewById2 = view.findViewById(R.id.mjn);
        o.LJIIIIZZ(findViewById2, "layout.findViewById(R.id.tv_send)");
        this.LJIIIZ = (SY4) findViewById2;
        View findViewById3 = view.findViewById(R.id.f12);
        o.LJIIIIZZ(findViewById3, "layout.findViewById(R.id.iv_cover)");
        this.LJIIJ = (C62846OlW) findViewById3;
        View findViewById4 = view.findViewById(R.id.ed3);
        o.LJIIIIZZ(findViewById4, "layout.findViewById(R.id.icv_cover_icon)");
        this.LJIIJJI = (TuxIconView) findViewById4;
        this.LJIIL = o.LJ(sharePackage.itemType, "comment");
    }
}
