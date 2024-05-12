package X;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.util.SparseArray;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import java.lang.ref.WeakReference;

/* renamed from: X.XsQ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86206XsQ implements WeakHandler.IHandler {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ UploadFileMethod LJLILLLLZI;

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        WeakReference<Context> weakReference;
        UploadFileMethod uploadFileMethod = this.LJLILLLLZI;
        SparseArray<AvatarUri> sparseArray = uploadFileMethod.mAvatarUriList;
        if (sparseArray == null || uploadFileMethod.mMultiUploadFailNum == null || uploadFileMethod.mMultiUploadSuccessNum == null || uploadFileMethod.mFileNameList == null || uploadFileMethod.mReturn == null || (weakReference = uploadFileMethod.mContextRef) == null || uploadFileMethod.isCancelUpload) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof C38333F2r) {
            Activity LJIJJ = C45804HyK.LJIJJ(weakReference.get());
            if (LJIJJ != null) {
                C1FJ.LJI((C38333F2r) message.obj, new C26045AKb(LJIJJ));
            }
            this.LJLILLLLZI.mAvatarUriList.put(this.LJLIL, new AvatarUri());
            this.LJLILLLLZI.mMultiUploadFailNum.incrementAndGet();
        } else if (obj instanceof AvatarUri) {
            AvatarUri avatarUri = (AvatarUri) obj;
            if (C38891fp.LJJIFFI(avatarUri.urlList)) {
                this.LJLILLLLZI.mAvatarUriList.put(this.LJLIL, avatarUri);
                this.LJLILLLLZI.mMultiUploadSuccessNum.incrementAndGet();
            } else {
                this.LJLILLLLZI.mAvatarUriList.put(this.LJLIL, new AvatarUri());
                this.LJLILLLLZI.mMultiUploadFailNum.incrementAndGet();
            }
        } else {
            sparseArray.put(this.LJLIL, new AvatarUri());
            this.LJLILLLLZI.mMultiUploadFailNum.incrementAndGet();
        }
        if (this.LJLILLLLZI.mMultiUploadSuccessNum.get() + this.LJLILLLLZI.mMultiUploadFailNum.get() != this.LJLILLLLZI.mFileNameList.size()) {
            return;
        }
        if (this.LJLILLLLZI.mMultiUploadFailNum.get() == this.LJLILLLLZI.mFileNameList.size()) {
            UploadFileMethod uploadFileMethod2 = this.LJLILLLLZI;
            uploadFileMethod2.buildMultiObject(uploadFileMethod2.mAvatarUriList);
            this.LJLILLLLZI.mReturn.LIZ(0, "H5_uploadFileFailed");
        } else {
            UploadFileMethod uploadFileMethod3 = this.LJLILLLLZI;
            this.LJLILLLLZI.mReturn.LIZJ(1, "H5_uploadFile", uploadFileMethod3.buildMultiObject(uploadFileMethod3.mAvatarUriList));
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLILLLLZI.mOnUploadFinishedListener;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C43115Gw3.LIZJ(this.LJLILLLLZI.mImageWidth);
    }

    public C86206XsQ(UploadFileMethod uploadFileMethod, int i) {
        this.LJLILLLLZI = uploadFileMethod;
        this.LJLIL = i;
    }
}
