package X;

import android.app.Activity;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.fe.method.upload.PickPhotoUploadFeature;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.XsX, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86213XsX implements WeakHandler.IHandler {
    public final /* synthetic */ PickPhotoUploadFeature LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public C86213XsX(PickPhotoUploadFeature pickPhotoUploadFeature, int i) {
        this.LJLIL = pickPhotoUploadFeature;
        this.LJLILLLLZI = i;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        boolean z;
        PickPhotoUploadFeature pickPhotoUploadFeature = this.LJLIL;
        if (pickPhotoUploadFeature.isCancelUpload) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof C38333F2r) {
            Activity activity = pickPhotoUploadFeature.contextRef.get();
            if (activity != null) {
                C5S1 c5s1 = new C5S1(activity);
                Object obj2 = message.obj;
                o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                c5s1.LIZLLL(((C38333F2r) obj2).getErrorMsg());
                c5s1.LJ();
            }
            AtomicInteger atomicInteger = this.LJLIL.mMultiUploadFailNum;
            if (atomicInteger != null) {
                atomicInteger.incrementAndGet();
            } else {
                o.LJIJI("mMultiUploadFailNum");
                throw null;
            }
        } else if (obj instanceof AvatarUri) {
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri");
            AvatarUri avatarUri = (AvatarUri) obj;
            if (C38891fp.LJJIFFI(avatarUri.urlList)) {
                HashMap<Integer, AvatarUri> hashMap = this.LJLIL.mAvatarUriList;
                if (hashMap != null) {
                    hashMap.put(Integer.valueOf(this.LJLILLLLZI), avatarUri);
                    AtomicInteger atomicInteger2 = this.LJLIL.mMultiUploadSuccessNum;
                    if (atomicInteger2 != null) {
                        atomicInteger2.incrementAndGet();
                    } else {
                        o.LJIJI("mMultiUploadSuccessNum");
                        throw null;
                    }
                } else {
                    o.LJIJI("mAvatarUriList");
                    throw null;
                }
            } else {
                AtomicInteger atomicInteger3 = this.LJLIL.mMultiUploadFailNum;
                if (atomicInteger3 != null) {
                    atomicInteger3.incrementAndGet();
                } else {
                    o.LJIJI("mMultiUploadFailNum");
                    throw null;
                }
            }
        } else {
            AtomicInteger atomicInteger4 = pickPhotoUploadFeature.mMultiUploadFailNum;
            if (atomicInteger4 != null) {
                atomicInteger4.incrementAndGet();
            } else {
                o.LJIJI("mMultiUploadFailNum");
                throw null;
            }
        }
        AtomicInteger atomicInteger5 = this.LJLIL.mMultiUploadFailNum;
        if (atomicInteger5 != null) {
            int i = atomicInteger5.get();
            AtomicInteger atomicInteger6 = this.LJLIL.mMultiUploadSuccessNum;
            if (atomicInteger6 != null) {
                int i2 = atomicInteger6.get() + i;
                List<String> list = this.LJLIL.mFileNameList;
                if (list != null) {
                    if (i2 == list.size()) {
                        List<String> list2 = this.LJLIL.mFileNameList;
                        if (list2 != null) {
                            int size = list2.size();
                            AtomicInteger atomicInteger7 = this.LJLIL.mMultiUploadSuccessNum;
                            if (atomicInteger7 != null) {
                                int i3 = atomicInteger7.get();
                                if (i3 == 0) {
                                    this.LJLIL.onFileSelected.LIZ(0, "uploadFailedAll");
                                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL.mOnUploadFinishedListener;
                                    if (interfaceC65784Pro != null) {
                                        interfaceC65784Pro.invoke();
                                    }
                                    C43115Gw3.LIZJ(this.LJLIL.mImageWidth);
                                    return;
                                }
                                if (i3 >= 0 && i3 < size) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    this.LJLIL.onFileSelected.LIZ(0, "uploadFailed");
                                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJLIL.mOnUploadFinishedListener;
                                    if (interfaceC65784Pro2 != null) {
                                        interfaceC65784Pro2.invoke();
                                    }
                                    C43115Gw3.LIZJ(this.LJLIL.mImageWidth);
                                    return;
                                }
                                if (i3 != size) {
                                    return;
                                }
                                ArrayList<C86219Xsd> arrayList = new ArrayList<>();
                                List<String> list3 = this.LJLIL.mFileNameList;
                                if (list3 != null) {
                                    int size2 = list3.size();
                                    for (int i4 = 0; i4 < size2; i4++) {
                                        HashMap<Integer, AvatarUri> hashMap2 = this.LJLIL.mAvatarUriList;
                                        if (hashMap2 != null) {
                                            AvatarUri avatarUri2 = hashMap2.get(Integer.valueOf(i4));
                                            if (avatarUri2 != null && avatarUri2.urlList != null) {
                                                o.LJIIIIZZ(avatarUri2.urlList, "uri.urlList");
                                                if (!r1.isEmpty()) {
                                                    String url = (String) ListProtector.get(avatarUri2.urlList, 0);
                                                    o.LJIIIIZZ(url, "url");
                                                    String str = avatarUri2.uri;
                                                    o.LJIIIIZZ(str, "uri.uri");
                                                    List<String> list4 = this.LJLIL.mFileNameList;
                                                    if (list4 != null) {
                                                        arrayList.add(new C86219Xsd(url, str, (String) ListProtector.get(list4, i4)));
                                                    } else {
                                                        o.LJIJI("mFileNameList");
                                                        throw null;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        } else {
                                            o.LJIJI("mAvatarUriList");
                                            throw null;
                                        }
                                    }
                                    int size3 = arrayList.size();
                                    HashMap<Integer, AvatarUri> hashMap3 = this.LJLIL.mAvatarUriList;
                                    if (hashMap3 != null) {
                                        if (size3 == hashMap3.size()) {
                                            this.LJLIL.uploadData(null, arrayList);
                                            return;
                                        }
                                        this.LJLIL.onFileSelected.LIZ(0, "uploadFailed");
                                        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = this.LJLIL.mOnUploadFinishedListener;
                                        if (interfaceC65784Pro3 != null) {
                                            interfaceC65784Pro3.invoke();
                                        }
                                        C43115Gw3.LIZJ(this.LJLIL.mImageWidth);
                                        return;
                                    }
                                    o.LJIJI("mAvatarUriList");
                                    throw null;
                                }
                                o.LJIJI("mFileNameList");
                                throw null;
                            }
                            o.LJIJI("mMultiUploadSuccessNum");
                            throw null;
                        }
                        o.LJIJI("mFileNameList");
                        throw null;
                    }
                    return;
                }
                o.LJIJI("mFileNameList");
                throw null;
            }
            o.LJIJI("mMultiUploadSuccessNum");
            throw null;
        }
        o.LJIJI("mMultiUploadFailNum");
        throw null;
    }
}
