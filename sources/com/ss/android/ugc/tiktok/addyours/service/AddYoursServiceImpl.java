package com.ss.android.ugc.tiktok.addyours.service;

import X.AbstractC186347Ta;
import X.AbstractC186377Td;
import X.ActivityC45651qj;
import X.C00F;
import X.C05L;
import X.C141335gf;
import X.C188727au;
import X.C198517qh;
import X.C198657qv;
import X.C219908k6;
import X.C220438kx;
import X.C221018lt;
import X.C221728n2;
import X.C234869Jq;
import X.C235769Nc;
import X.C246449lo;
import X.C3C5;
import X.C55480Lq0;
import X.C58096Mr6;
import X.C68862n4;
import X.C76800UCe;
import X.C78613UtF;
import X.C84763XOl;
import X.EnumC58928NAu;
import X.InterfaceC1798974f;
import X.InterfaceC67352kd;
import X.JHM;
import X.ORS;
import X.ORZ;
import X.X1D;
import X.XKX;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.LruCache;
import android.view.ViewStub;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.sticker.AddYoursModelCheckService;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerRecordServiceImpl;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListPage;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursNoticeVideosResp;
import com.ss.android.ugc.tiktok.addyours.route.LegacyQnaRouteInterceptor;
import com.ss.android.ugc.tiktok.addyours.service.AddYoursServiceImpl;
import com.ss.android.ugc.tiktok.addyours.utils.AddYoursStickerManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AddYoursServiceImpl implements IAddYoursService {

    /* loaded from: classes4.dex */
    public static final class AddYoursCollectionListPageData extends PowerViewPagerFragmentItem<AddYoursCollectionListPage> {
        public static final Parcelable.Creator<AddYoursCollectionListPageData> CREATOR = new Parcelable.Creator<AddYoursCollectionListPageData>() { // from class: X.8jJ
            @Override // android.os.Parcelable.Creator
            public final AddYoursServiceImpl.AddYoursCollectionListPageData createFromParcel(Parcel parcel) {
                o.LJIIIZ(parcel, "parcel");
                parcel.readInt();
                return new AddYoursServiceImpl.AddYoursCollectionListPageData();
            }

            @Override // android.os.Parcelable.Creator
            public final AddYoursServiceImpl.AddYoursCollectionListPageData[] newArray(int i) {
                return new AddYoursServiceImpl.AddYoursCollectionListPageData[i];
            }
        };

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeInt(1);
        }
    }

    public static IAddYoursService LJIJ() {
        Object LIZ = C58096Mr6.LIZ(IAddYoursService.class, false);
        if (LIZ != null) {
            return (IAddYoursService) LIZ;
        }
        if (C58096Mr6.M8 == null) {
            synchronized (IAddYoursService.class) {
                if (C58096Mr6.M8 == null) {
                    C58096Mr6.M8 = new AddYoursServiceImpl();
                }
            }
        }
        return C58096Mr6.M8;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final IInterceptor LJI() {
        return new LegacyQnaRouteInterceptor();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final boolean LIZLLL() {
        if (!C234869Jq.LIZ() || C00F.LIZ(31744, 0, "studio_enable_addyours_educate", true) != 1) {
            return false;
        }
        Keva repo = Keva.getRepo("add_yours_profile_guide");
        if (repo.getBoolean("has_click_cancel", false) || repo.getBoolean("has_click_notice", false) || repo.getInt("auto_hide_count", 0) >= 3) {
            return false;
        }
        if (System.currentTimeMillis() - repo.getLong("last_show_time", 0L) < 259200000) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final AbstractC186347Ta LIZIZ(final Context context) {
        o.LJIIIZ(context, "context");
        if (!C234869Jq.LIZ() || this == null) {
            return null;
        }
        return new AbstractC186347Ta(context) { // from class: X.8j0
            public final FavoriteTabItemV2 LJLILLLLZI;

            @Override // X.AbstractC186347Ta
            public final FavoriteTabItemV2 LIZ() {
                return this.LJLILLLLZI;
            }

            {
                int LIZJ = C226388uY.LIZJ(R.string.bcx, R.string.bd3);
                AddYoursServiceImpl.AddYoursCollectionListPageData addYoursCollectionListPageData = new AddYoursServiceImpl.AddYoursCollectionListPageData();
                String string = context.getString(LIZJ);
                o.LJIIIIZZ(string, "context.getString(pageTitleRes)");
                this.LJLILLLLZI = new FavoriteTabItemV2(addYoursCollectionListPageData, string, "add_yours", "questions");
            }

            @QD3(threadMode = ThreadMode.MAIN)
            public final void onCollectEvent(C219248j2 event) {
                o.LJIIIZ(event, "event");
                if (event.LJLILLLLZI != EnumC219268j4.COLLECT) {
                    return;
                }
                int collectStatus = event.LJLIL.getCollectStatus();
                if (collectStatus != 0) {
                    if (collectStatus != 1) {
                        return;
                    }
                    LIZLLL(this.LJLIL);
                    return;
                }
                LIZIZ(this.LJLIL);
            }
        };
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final AbstractC186377Td LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        if (!C234869Jq.LIZ() || this == null) {
            return null;
        }
        return new AddYoursCollectionListPage().vl(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ<java.lang.String, java.lang.String>[] LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.Aweme r10) {
        /*
            r9 = this;
            r7 = 1
            r8 = 0
            r6 = 0
            if (r10 == 0) goto L3c
            java.util.List r0 = r10.getInteractStickerStructs()
            if (r0 == 0) goto L3c
            java.util.Iterator r2 = r0.iterator()
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r0 = (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r0
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r0 = r0.getAddYoursStickerStruct()
            if (r0 == 0) goto Lf
        L22:
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r1 = (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r1
            if (r1 == 0) goto L3c
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r5 = r1.getAddYoursStickerStruct()
        L2a:
            java.lang.String r4 = "is_add_yours"
            if (r5 != 0) goto L3e
            X.OSZ[] r2 = new X.OSZ[r7]
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "0"
            r1.<init>(r4, r0)
            r2[r8] = r1
            return r2
        L3a:
            r1 = r6
            goto L22
        L3c:
            r5 = r6
            goto L2a
        L3e:
            r0 = 3
            X.OSZ[] r3 = new X.OSZ[r0]
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "1"
            r1.<init>(r4, r0)
            r3[r8] = r1
            java.lang.Long r0 = r5.getTopicId()
            if (r0 == 0) goto L54
            java.lang.String r6 = r0.toString()
        L54:
            java.lang.String r2 = ""
            if (r6 != 0) goto L59
            r6 = r2
        L59:
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "add_yours_id"
            r1.<init>(r0, r6)
            r3[r7] = r1
            java.lang.String r0 = r5.getText()
            if (r0 != 0) goto L73
        L68:
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "add_yours_title"
            r1.<init>(r0, r2)
            r0 = 2
            r3[r0] = r1
            return r3
        L73:
            r2 = r0
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.service.AddYoursServiceImpl.LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.Aweme):X.OSZ[]");
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJIIIZ(C221728n2 listener) {
        o.LJIIIZ(listener, "listener");
        AddYoursStickerManager.LIZ.getClass();
        ORS.LJJLIL(new AqS169S0100000_3(listener, 620), AddYoursStickerManager.LIZLLL);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final Object LIZ(long j, InterfaceC67352kd<? super AddYoursStickerStruct> interfaceC67352kd) {
        return AddYoursStickerManager.LIZ.LIZIZ(j, false, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(com.ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.Object r6) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L34
            java.util.List r0 = r5.getInteractStickerStructs()
            if (r0 == 0) goto L34
            java.util.Iterator r2 = r0.iterator()
        Ld:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r0 = (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r0
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r0 = r0.getAddYoursStickerStruct()
            if (r0 == 0) goto Ld
        L20:
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r1 = (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r1
            if (r1 == 0) goto L34
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r2 = r1.getAddYoursStickerStruct()
        L28:
            java.lang.String r1 = "is_add_yours"
            if (r2 != 0) goto L36
            java.lang.String r0 = "0"
            LJIIZILJ(r1, r6, r0)
            return r6
        L32:
            r1 = r3
            goto L20
        L34:
            r2 = r3
            goto L28
        L36:
            java.lang.String r0 = "1"
            LJIIZILJ(r1, r6, r0)
            java.lang.Long r0 = r2.getTopicId()
            if (r0 == 0) goto L45
            java.lang.String r3 = r0.toString()
        L45:
            java.lang.String r1 = ""
            if (r3 != 0) goto L4a
            r3 = r1
        L4a:
            java.lang.String r0 = "add_yours_id"
            LJIIZILJ(r0, r6, r3)
            java.lang.String r0 = r2.getText()
            if (r0 != 0) goto L5b
        L55:
            java.lang.String r0 = "add_yours_title"
            LJIIZILJ(r0, r6, r1)
            return r6
        L5b:
            r1 = r0
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.service.AddYoursServiceImpl.LJII(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Object):java.lang.Object");
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJIIJJI(AddYoursStickerStruct addYoursStickerStruct, C221728n2 listener) {
        o.LJIIIZ(listener, "listener");
        AddYoursStickerManager.LIZ.getClass();
        C221018lt.LJFF("AddYoursStickerManager", "registerStickerUpdateListener");
        AddYoursStickerManager.LIZLLL.add(new C220438kx(new WeakReference(listener), addYoursStickerStruct));
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final AddYoursStickerStruct LJIILL(String str, AddYoursStickerStruct addYoursSticker) {
        o.LJIIIZ(addYoursSticker, "addYoursSticker");
        AddYoursStickerManager.LIZ.getClass();
        Long topicId = addYoursSticker.getTopicId();
        if (topicId != null) {
            long longValue = topicId.longValue();
            if (str != null) {
                AddYoursStickerManager.LIZJ.put(str, Long.valueOf(longValue));
            }
            LruCache<Long, AddYoursStickerStruct> lruCache = AddYoursStickerManager.LIZIZ;
            AddYoursStickerStruct addYoursStickerStruct = lruCache.get(Long.valueOf(longValue));
            if (addYoursStickerStruct != null && addYoursStickerStruct.getTimeStamp() > addYoursSticker.getTimeStamp()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("getLatestAddYoursSticker, use cache, topicId:");
                LIZ.append(addYoursSticker.getTopicId());
                C221018lt.LJFF("AddYoursStickerManager", X1D.LIZIZ(LIZ));
                return addYoursStickerStruct;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getLatestAddYoursSticker, use current and notify, topicId:");
            LIZ2.append(addYoursSticker.getTopicId());
            C221018lt.LJFF("AddYoursStickerManager", X1D.LIZIZ(LIZ2));
            lruCache.put(Long.valueOf(longValue), addYoursSticker);
            AddYoursStickerManager.LIZJ(addYoursSticker);
            return addYoursSticker;
        }
        return addYoursSticker;
    }

    public static void LJIIZILJ(String str, Object obj, String str2) {
        Object obj2;
        try {
            if (obj instanceof JHM) {
                JHM jhm = (JHM) obj;
                jhm.getClass();
                jhm.LJ(str, str2, InterfaceC1798974f.LIZ);
                obj2 = jhm;
            } else if (obj instanceof C198517qh) {
                C198517qh c198517qh = (C198517qh) obj;
                c198517qh.LIZ.put(str, str2);
                obj2 = c198517qh;
            } else if (obj instanceof C188727au) {
                C188727au c188727au = (C188727au) obj;
                c188727au.getClass();
                c188727au.LJIIIZ(str, str2);
                obj2 = c188727au;
            } else if (obj instanceof JSONObject) {
                obj2 = ((JSONObject) obj).put(str, str2);
            } else {
                obj2 = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(obj2);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJFF(C235769Nc c235769Nc, ViewStub viewStub, ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        PopupManager.LJIIL(new C246449lo(c235769Nc, viewStub, activity));
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJIIJ(ActivityC45651qj activity, Aweme aweme, AddYourRecordParam addYourRecordParam) {
        o.LJIIIZ(activity, "activity");
        AddYoursStickerRecordServiceImpl.LIZIZ().LIZ(activity, aweme, addYourRecordParam).LIZLLL();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final Object LJ(List list, long j, String str, C198657qv c198657qv) {
        Object LJI = XKX.LJI(C78613UtF.LIZJ, new C68862n4(list, j, str, null), c198657qv);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJIIL(Context context, Aweme aweme, TextExtraStruct textExtraStruct, String eventType) {
        String str;
        InteractStickerStruct interactStickerStruct;
        o.LJIIIZ(eventType, "eventType");
        String str2 = null;
        r4 = null;
        QaStruct qaStruct = null;
        if (QnaService.LIZ().enablePublicQna()) {
            List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
            if (interactStickerStructs != null && (interactStickerStruct = (InteractStickerStruct) ORZ.LJLLLL(interactStickerStructs)) != null) {
                qaStruct = interactStickerStruct.getQaStruct();
            }
            if (AddYoursModelCheckService.LIZJ().LIZIZ() && qaStruct != null && qaStruct.getQuestionId() != 0) {
                SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://qna/detail/");
                buildRoute.withParam("id", String.valueOf(qaStruct.getQuestionId()));
                buildRoute.withParam("extra_question_from", eventType);
                buildRoute.withParam("aweme_id", aweme.getAid());
                buildRoute.withParam("qid", String.valueOf(qaStruct.getQuestionId()));
                buildRoute.withParam("enter_from", eventType);
                buildRoute.withParam("process_id", UUID.randomUUID().toString());
                buildRoute.open();
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            C05L.LIZLLL(context, R.string.pqk);
            return;
        }
        SmartRoute buildRoute2 = SmartRouter.buildRoute(context, "aweme://user/profile/");
        if (textExtraStruct != null) {
            str = textExtraStruct.getUserId();
        } else {
            str = null;
        }
        buildRoute2.withParam("uid", str);
        if (textExtraStruct != null) {
            str2 = textExtraStruct.getSecUid();
        }
        buildRoute2.withParam("sec_user_id", str2);
        buildRoute2.withParam("profile_from", "video_at");
        buildRoute2.withParam("enter_from", eventType);
        buildRoute2.withParam("video_id", aweme.getAid());
        buildRoute2.open();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final AddYoursNoticeVideosResp LJIILJJIL(int i, long j, long j2, String str) {
        return C219908k6.LIZ().getTopicParticipants(j, j2, i, str).execute().LIZIZ;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJIILIIL(Context context, Bundle bundle, String questionId, String str, String enterFrom) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(questionId, "questionId");
        o.LJIIIZ(enterFrom, "enterFrom");
        if (QnaService.LIZ().enablePublicQna()) {
            SmartRoute buildRoute = SmartRouter.buildRoute(C84763XOl.LJIIIIZZ(), "aweme://qna/detail/");
            buildRoute.withParam("id", questionId);
            buildRoute.withParam("process_id", str);
            buildRoute.withParam(bundle);
            buildRoute.open();
            return;
        }
        if (C234869Jq.LIZ()) {
            String curUserId = AccountService.LJIJ().LJFF().getCurUserId();
            C55480Lq0.LIZIZ.LIZIZ(1);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("//add_yours/hub/");
            LIZ.append(curUserId);
            SmartRoute buildRoute2 = SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ));
            buildRoute2.withParam("show_topic_detail", 1);
            buildRoute2.withParam("topic_id", questionId);
            buildRoute2.withParam("is_from_qa", true);
            buildRoute2.withParam("enter_method", "qa_share");
            buildRoute2.withParam("enter_from", enterFrom);
            buildRoute2.withParam(bundle);
            buildRoute2.open();
            return;
        }
        C05L.LIZLLL(context, R.string.pqk);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJIILLIIL(Context context, AddYoursTopic topic, Aweme aweme, Integer num, List<AddYoursAvatar> list, boolean z, String str, String str2, int i, String str3) {
        AddYoursAvatar[] addYoursAvatarArr;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(topic, "topic");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//addyours/topic_detail");
        buildRoute.withParam("topic", topic);
        buildRoute.withParam("from_aweme", aweme);
        buildRoute.withParam("enter_from", str);
        buildRoute.withParam("follow_status", num);
        if (list != null) {
            addYoursAvatarArr = (AddYoursAvatar[]) list.toArray(new AddYoursAvatar[0]);
        } else {
            addYoursAvatarArr = null;
        }
        buildRoute.withParam("user_avatars", addYoursAvatarArr);
        buildRoute.withParam("category_name", str2);
        buildRoute.withParam("entrance_category", i);
        buildRoute.withParam("is_from_qa_sticker", z);
        buildRoute.withParam("viewed_user_id", str3);
        buildRoute.open();
    }
}
