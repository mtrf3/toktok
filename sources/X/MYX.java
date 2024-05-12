package X;

import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.IInboxLiveService;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.inbox.skylight.plat.OnThisDayExtraData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.CustomBizData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.TemplateData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.OnThisDayResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MYX extends AbstractC116364hU<InterfaceC57784Mm4> {
    public List<SkylightData> LIZJ;
    public final C62822Ol8 LIZLLL;

    @Override // X.AbstractC116364hU
    public final Object LIZJ() {
        User user;
        List<SkylightData> list = this.LIZJ;
        ArrayList arrayList = new ArrayList();
        for (SkylightData skylightData : list) {
            SkylightData skylightData2 = skylightData;
            CustomBizData customBizData = skylightData2.getCustomBizData();
            String str = null;
            if (customBizData != null && (user = customBizData.getUser()) != null) {
                str = user.getUid();
            }
            boolean z = false;
            if (str != null && str.length() != 0 && str != null && (z = this.LIZ.LJFF(skylightData2.getPriority(), str))) {
                this.LIZ.LIZ().put(str, new Integer(skylightData2.getPriority()));
            }
            if (skylightData2.getBizType() == 4 || z) {
                arrayList.add(skylightData);
            }
        }
        this.LIZJ = C65777Prh.LIZIZ(arrayList);
        return this;
    }

    @Override // X.AbstractC116364hU
    public final Object LIZLLL() {
        String str;
        Aweme aweme;
        String str2;
        long j;
        int i = 0;
        for (SkylightData skylightData : this.LIZJ) {
            int bizType = skylightData.getBizType();
            if (bizType != 1) {
                OnThisDayResponse onThisDayResponse = null;
                if (bizType != 3) {
                    if (bizType != 4) {
                        C116094h3 LIZJ = C56350M9q.LIZJ(skylightData);
                        if (LIZJ != null) {
                            this.LIZIZ.add(LIZJ);
                        }
                    } else {
                        TemplateData templateData = skylightData.getTemplateData();
                        if (templateData != null) {
                            str = templateData.getExtraData();
                        } else {
                            str = null;
                        }
                        OnThisDayExtraData onThisDayExtraData = (OnThisDayExtraData) C75792yF.LIZ(str, OnThisDayExtraData.class);
                        CustomBizData customBizData = skylightData.getCustomBizData();
                        if (customBizData != null && (aweme = customBizData.getAweme()) != null) {
                            int i2 = 0;
                            String pastKeyMemory = onThisDayExtraData.getPastKeyMemory();
                            if (pastKeyMemory == null) {
                                pastKeyMemory = "";
                            }
                            onThisDayResponse = new OnThisDayResponse(aweme, i2, i2, pastKeyMemory, skylightData.getPriority(), 6, null);
                        }
                        C48710J9u convertDayResponseToItem = C55723Ltv.LIZIZ.LIZ().convertDayResponseToItem(onThisDayResponse);
                        if (convertDayResponseToItem != null) {
                            this.LIZIZ.add(convertDayResponseToItem);
                        }
                    }
                } else {
                    CustomBizData customBizData2 = skylightData.getCustomBizData();
                    if (customBizData2 != null) {
                        str2 = customBizData2.getRoomInfo();
                    } else {
                        str2 = null;
                    }
                    SlimRoom slimRoom = (SlimRoom) C75792yF.LIZ(String.valueOf(str2), SlimRoom.class);
                    if (customBizData2 != null) {
                        User user = customBizData2.getUser();
                        if (user != null) {
                            String roomInfo = customBizData2.getRoomInfo();
                            if (roomInfo == null) {
                                roomInfo = null;
                            }
                            user.roomData = roomInfo;
                            if (slimRoom != null) {
                                j = slimRoom.getId();
                            } else {
                                j = 0;
                            }
                            user.roomId = j;
                        }
                        InboxLiveNotice inboxLiveNotice = new InboxLiveNotice(customBizData2.getUser(), customBizData2.getType(), slimRoom, false, null, skylightData.getPriority(), 24, null);
                        User user2 = inboxLiveNotice.getUser();
                        if (user2 == null || user2.roomId != 0) {
                            this.LIZIZ.add(((IInboxLiveService) this.LIZLLL.getValue()).mapLiveItem(inboxLiveNotice, ((Boolean) C46604IQu.LJIIJ.getValue()).booleanValue(), i));
                            i++;
                        }
                    }
                }
            } else {
                C116094h3 LIZJ2 = C56350M9q.LIZJ(skylightData);
                if (LIZJ2 != null) {
                    this.LIZIZ.add(LIZJ2);
                }
            }
        }
        return this;
    }

    @Override // X.AbstractC116364hU
    public final C76800UCe LIZ() {
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MYX(InterfaceC116134h7 ft) {
        super(ft);
        o.LJIIIZ(ft, "ft");
        this.LIZJ = new ArrayList();
        this.LIZLLL = C221108m2.LIZIZ(C57000MYq.LJLIL);
    }

    @Override // X.AbstractC116364hU
    public final Object LIZIZ(InterfaceC67352kd<? super AbstractC116364hU<InterfaceC57784Mm4>> interfaceC67352kd) {
        List<SkylightData> dataList;
        this.LIZJ.clear();
        this.LIZIZ.clear();
        SkylightDataResponse skylightData = this.LIZ.LJII().getSkylightData();
        if (skylightData != null && (dataList = skylightData.getDataList()) != null) {
            this.LIZJ.addAll(dataList);
        }
        return this;
    }
}
