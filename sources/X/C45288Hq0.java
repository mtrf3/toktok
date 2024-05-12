package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hq0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45288Hq0 implements InterfaceC45289Hq1 {
    public final /* synthetic */ MvChoosePhotoScene LIZ;

    public C45288Hq0(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LIZ = mvChoosePhotoScene;
    }

    @Override // X.InterfaceC45289Hq1
    public final void LIZ(List<MyMediaModel> mediaList) {
        Activity activity;
        o.LJIIIZ(mediaList, "mediaList");
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        InterfaceC41948GdE interfaceC41948GdE = mvChoosePhotoScene.LJLJLJ;
        if (interfaceC41948GdE != null && (activity = mvChoosePhotoScene.mActivity) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(mediaList, 10));
            Iterator<MyMediaModel> it = mediaList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().fileLocalUriPath);
            }
            interfaceC41948GdE.checkValidAndUpload(activity, arrayList, "upload_page", new AqS138S0200000_7((List) mediaList, (List<MyMediaModel>) mvChoosePhotoScene, (MvChoosePhotoScene) 20));
        }
    }
}
