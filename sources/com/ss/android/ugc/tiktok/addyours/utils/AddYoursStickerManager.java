package com.ss.android.ugc.tiktok.addyours.utils;

import X.C16880lQ;
import X.C1DH;
import X.C220428kw;
import X.C220438kx;
import X.C220458kz;
import X.C221018lt;
import X.C50420Jqa;
import X.C68322mC;
import X.C78613UtF;
import X.HG3;
import X.InterfaceC220468l0;
import X.InterfaceC67352kd;
import X.ORS;
import X.ORZ;
import X.QD3;
import X.RBX;
import X.X1D;
import X.XKX;
import Y.ARunnableS22S0200000_3;
import android.os.Looper;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.story.publish.SocialPublishBridgeServiceImpl;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import com.ss.android.ugc.tiktok.addyours.utils.AddYoursStickerManager;
import defpackage.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public final class AddYoursStickerManager {
    public static final AddYoursStickerManager LIZ;
    public static final LruCache<Long, AddYoursStickerStruct> LIZIZ;
    public static final LruCache<String, Long> LIZJ;
    public static final CopyOnWriteArrayList<C220438kx> LIZLLL;

    static {
        AddYoursStickerManager addYoursStickerManager = new AddYoursStickerManager();
        LIZ = addYoursStickerManager;
        C221018lt.LJFF("AddYoursStickerManager", "observePublishStatus");
        SocialPublishBridgeServiceImpl.LIZ().LJIIJJI(new SocialPublishCallback() { // from class: X.8ky
            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishProgress(int i, PublishModel publishModel) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishStart(PublishModel publishModel) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onReadyToCreateAweme(PublishModel publishModel) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse) {
                String str;
                InteractStickerStruct interactStickerStruct;
                AddYoursStickerStruct addYoursStickerStruct;
                Long topicId;
                List arrayList;
                long j;
                String str2;
                o.LJIIIZ(createAwemeResponse, "createAwemeResponse");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("trigger by: onPublishSuccess, shootWay=");
                if (publishModel != null) {
                    str = publishModel.shootWay;
                } else {
                    str = null;
                }
                b0.LJFF(LIZ2, str, LIZ2, "AddYoursStickerManager");
                AddYoursStickerManager addYoursStickerManager2 = AddYoursStickerManager.LIZ;
                Aweme aweme = createAwemeResponse.aweme;
                o.LJIIIIZZ(aweme, "createAwemeResponse.aweme");
                addYoursStickerManager2.getClass();
                C221018lt.LJFF("AddYoursStickerManager", "handleVideoPublish");
                List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
                if (interactStickerStructs != null) {
                    Iterator<InteractStickerStruct> it = interactStickerStructs.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            interactStickerStruct = it.next();
                            if (interactStickerStruct.getAddYoursStickerStruct() != null) {
                                break;
                            }
                        } else {
                            interactStickerStruct = null;
                            break;
                        }
                    }
                    InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
                    if (interactStickerStruct2 == null || (addYoursStickerStruct = interactStickerStruct2.getAddYoursStickerStruct()) == null || (topicId = addYoursStickerStruct.getTopicId()) == null) {
                        return;
                    }
                    long longValue = topicId.longValue();
                    C221018lt.LJFF("AddYoursStickerManager", "addSelfAvatarIfNotExist");
                    List<AddYoursAvatar> userAvatars = addYoursStickerStruct.getUserAvatars();
                    if (userAvatars != null) {
                        arrayList = ORZ.LLJILJILJ(userAvatars);
                    } else {
                        arrayList = new ArrayList();
                    }
                    Long videoCount = addYoursStickerStruct.getVideoCount();
                    long j2 = 0;
                    if (videoCount != null) {
                        j = videoCount.longValue();
                    } else {
                        j = 0;
                    }
                    User curUser = ((RBX) HG3.LJIILL()).getCurUser();
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Long uid = ((AddYoursAvatar) it2.next()).getUid();
                            if (uid != null) {
                                str2 = uid.toString();
                            } else {
                                str2 = null;
                            }
                            if (o.LJ(str2, curUser.getUid())) {
                                break;
                            }
                        }
                    }
                    j++;
                    String uid2 = curUser.getUid();
                    o.LJIIIIZZ(uid2, "curUser.uid");
                    Long LJJIZ = C38350F3i.LJJIZ(uid2);
                    if (LJJIZ != null) {
                        j2 = LJJIZ.longValue();
                    }
                    ListProtector.add(arrayList, 0, new AddYoursAvatar(Long.valueOf(j2), curUser.getAvatarThumb(), curUser.getNickname()));
                    AddYoursStickerStruct copy$default = AddYoursStickerStruct.copy$default(addYoursStickerStruct, null, null, null, null, arrayList, Long.valueOf(j), null, null, null, System.currentTimeMillis(), 463, null);
                    if (AddYoursStickerManager.LIZIZ.put(Long.valueOf(longValue), copy$default) == null) {
                        return;
                    }
                    AddYoursStickerManager.LIZ.getClass();
                    AddYoursStickerManager.LIZJ(copy$default);
                }
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onSynthetiseSuccess(PublishModel publishModel, String path) {
                o.LJIIIZ(path, "path");
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishFailed(PublishModel publishModel, C41759GaB exception, String errorMsg) {
                o.LJIIIZ(exception, "exception");
                o.LJIIIZ(errorMsg, "errorMsg");
            }
        }, C220458kz.LJLIL);
        EventBus.LIZJ().LJIILJJIL(addYoursStickerManager);
        LIZIZ = new LruCache<>(50);
        LIZJ = new LruCache<>(50);
        LIZLLL = new CopyOnWriteArrayList<>();
    }

    public static AddYoursStickerStruct LIZ(AddYoursStickerStruct addYoursStickerStruct) {
        long j;
        C221018lt.LJFF("AddYoursStickerManager", "deleteSelfAvatarIfExist");
        List<AddYoursAvatar> userAvatars = addYoursStickerStruct.getUserAvatars();
        if (userAvatars == null) {
            return addYoursStickerStruct;
        }
        List LLJILJILJ = ORZ.LLJILJILJ(userAvatars);
        Long videoCount = addYoursStickerStruct.getVideoCount();
        if (videoCount != null) {
            j = videoCount.longValue();
        } else {
            j = 0;
        }
        if (ORS.LJJLIL(new AqS169S0100000_3(((RBX) HG3.LJIILL()).getCurUser(), 619), LLJILJILJ)) {
            j--;
        }
        return AddYoursStickerStruct.copy$default(addYoursStickerStruct, null, null, null, null, LLJILJILJ, Long.valueOf(j), null, null, null, System.currentTimeMillis(), 463, null);
    }

    public static void LIZJ(AddYoursStickerStruct addYoursStickerStruct) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("notifyStickerUpdate, listeners size=");
        CopyOnWriteArrayList<C220438kx> copyOnWriteArrayList = LIZLLL;
        LIZ2.append(copyOnWriteArrayList.size());
        C221018lt.LJFF("AddYoursStickerManager", X1D.LIZIZ(LIZ2));
        ArrayList arrayList = new ArrayList();
        Iterator<C220438kx> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C220438kx next = it.next();
            C220438kx c220438kx = next;
            if (o.LJ(c220438kx.LJLILLLLZI.getTopicId(), addYoursStickerStruct.getTopicId()) && !o.LJ(c220438kx.LJLILLLLZI.getUserAvatars(), addYoursStickerStruct.getUserAvatars()) && c220438kx.LJLIL.get() != null) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C220438kx c220438kx2 = (C220438kx) it2.next();
            InterfaceC220468l0 interfaceC220468l0 = c220438kx2.LJLIL.get();
            if (interfaceC220468l0 != null) {
                AddYoursStickerStruct copy$default = AddYoursStickerStruct.copy$default(addYoursStickerStruct, null, null, null, null, null, null, null, null, null, 0L, 1023, null);
                o.LJIIIZ(copy$default, "<set-?>");
                c220438kx2.LJLILLLLZI = copy$default;
                if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                    interfaceC220468l0.LIZ(copy$default);
                    C221018lt.LJFF("AddYoursStickerManager", "notifyStickerUpdate, notify directly");
                } else {
                    C1DH.LJJIJIIJI(new ARunnableS22S0200000_3(interfaceC220468l0, copy$default, 28));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @QD3
    public final void onVideoEvent(C50420Jqa c50420Jqa) {
        Integer num;
        InteractStickerStruct interactStickerStruct;
        AddYoursStickerStruct addYoursStickerStruct;
        Long topicId;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onVideoEvent, eventType=");
        if (c50420Jqa != null) {
            num = Integer.valueOf(c50420Jqa.LJLIL);
        } else {
            num = null;
        }
        LIZ2.append(num);
        C221018lt.LJFF("AddYoursStickerManager", X1D.LIZIZ(LIZ2));
        if (c50420Jqa != null && c50420Jqa.LJLILLLLZI != null && c50420Jqa.LJLIL == 2) {
            Object obj = c50420Jqa.LJLILLLLZI;
            if (obj instanceof Aweme) {
                C221018lt.LJFF("AddYoursStickerManager", "handleVideoDelete by aweme with sticker");
                List<InteractStickerStruct> interactStickerStructs = ((Aweme) obj).getInteractStickerStructs();
                if (interactStickerStructs != null) {
                    Iterator<InteractStickerStruct> it = interactStickerStructs.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            interactStickerStruct = it.next();
                            if (interactStickerStruct.getAddYoursStickerStruct() != null) {
                                break;
                            }
                        } else {
                            interactStickerStruct = null;
                            break;
                        }
                    }
                    InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
                    if (interactStickerStruct2 == null || (addYoursStickerStruct = interactStickerStruct2.getAddYoursStickerStruct()) == null || (topicId = addYoursStickerStruct.getTopicId()) == null) {
                        return;
                    }
                    long longValue = topicId.longValue();
                    AddYoursStickerStruct LIZ3 = LIZ(addYoursStickerStruct);
                    if (LIZIZ.put(Long.valueOf(longValue), LIZ3) == null) {
                        return;
                    }
                    LIZ.getClass();
                    LIZJ(LIZ3);
                    return;
                }
                return;
            }
            if (!(obj instanceof String)) {
                return;
            }
            C221018lt.LJFF("AddYoursStickerManager", "handleVideoDelete by aid");
            Long l = (Long) LIZJ.get(obj);
            if (l == null) {
                return;
            }
            long longValue2 = l.longValue();
            LruCache<Long, AddYoursStickerStruct> lruCache = LIZIZ;
            AddYoursStickerStruct addYoursStickerStruct2 = lruCache.get(Long.valueOf(longValue2));
            if (addYoursStickerStruct2 == null) {
                return;
            }
            AddYoursStickerStruct LIZ4 = LIZ(addYoursStickerStruct2);
            if (lruCache.put(Long.valueOf(longValue2), LIZ4) == null) {
                return;
            }
            LIZ.getClass();
            LIZJ(LIZ4);
        }
    }

    public final Object LIZIZ(long j, boolean z, InterfaceC67352kd<? super AddYoursStickerStruct> interfaceC67352kd) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getAddYoursStickerByQA, questionId=");
        LIZ2.append(j);
        LIZ2.append(", forceNet=");
        LIZ2.append(z);
        C221018lt.LJFF("AddYoursStickerManager", X1D.LIZIZ(LIZ2));
        return XKX.LJI(C78613UtF.LIZJ, new C220428kw(z, new C68322mC(), j, null), interfaceC67352kd);
    }
}
