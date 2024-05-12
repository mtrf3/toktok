package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.ArrayList;

/* renamed from: X.HtN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45497HtN implements UDT {
    public final /* synthetic */ MvChoosePhotoScene LIZ;

    @Override // X.UDT
    public final void LIZ() {
    }

    public C45497HtN(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LIZ = mvChoosePhotoScene;
    }

    @Override // X.UDT
    public final void LIZIZ(C45539Hu3 c45539Hu3) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        arrayList.addAll(c45539Hu3.LJLIL);
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("choose_live_sub_media", arrayList);
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        Activity activity = mvChoosePhotoScene.mActivity;
        if (activity != null) {
            activity.setResult(mvChoosePhotoScene.LLZZZIL, intent);
        }
        this.LIZ.LLLZL(false);
    }
}
