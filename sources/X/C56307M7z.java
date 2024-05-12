package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.M7z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C56307M7z extends TBS implements InterfaceC88473Ynt<String, Object, EnumC84576XHg, C76800UCe> {
    public C56307M7z(Object obj) {
        super(3, obj, MixVideosDialog.class, "motaCacheSubscriber", "motaCacheSubscriber(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/mota/storage/motacache/StorageOperation;)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String p0, Object obj, EnumC84576XHg p2) {
        Boolean bool;
        TuxIconView tuxIconView;
        int i;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p2, "p2");
        MixVideosDialog mixVideosDialog = (MixVideosDialog) this.receiver;
        mixVideosDialog.getClass();
        if (obj != null && (obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            boolean booleanValue = bool.booleanValue();
            if (o.LJ(p0, mixVideosDialog.LJLJJI)) {
                View LJI = ((C252709vu) mixVideosDialog._$_findCachedViewById(R.id.gwg)).LJI("favorite_icon");
                if ((LJI instanceof TuxIconView) && (tuxIconView = (TuxIconView) LJI) != null) {
                    if (booleanValue) {
                        i = R.raw.icon_bookmark_fill;
                    } else {
                        i = R.raw.icon_bookmark;
                    }
                    tuxIconView.setIconRes(i);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
