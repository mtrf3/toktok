package com.bytedance.android.livesdk.impl.revenue.level.viewmodel;

import X.AbstractC73672Svk;
import X.B83;
import X.BZI;
import X.C09650Zl;
import X.C0NB;
import X.C15380j0;
import X.C1EW;
import X.C28467BFf;
import X.C28787BRn;
import X.C28992BZk;
import X.C29044Baa;
import X.C29049Baf;
import X.C29374Bfu;
import X.C29787BmZ;
import X.C29788Bma;
import X.C29790Bmc;
import X.C29796Bmi;
import X.C29797Bmj;
import X.C29798Bmk;
import X.C29799Bml;
import X.C29800Bmm;
import X.C29801Bmn;
import X.C29802Bmo;
import X.C29803Bmp;
import X.C30554Byw;
import X.C62705OjF;
import X.C65814PsI;
import X.C73411SrX;
import X.C73969T1h;
import X.C76800UCe;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.InterfaceC88472Yns;
import X.Q7L;
import X.T16;
import X.T28;
import X.WM7;
import X.X1D;
import Y.AfS53S0100000_1;
import Y.AfS54S0200000_5;
import Y.AfS56S0100000_4;
import Y.AfS57S0100000_5;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.api.revenue.level.event.UserLevelChannel;
import com.bytedance.android.livesdk.api.revenue.level.event.UserLevelEvent;
import com.bytedance.android.livesdk.impl.revenue.level.UserLevelWidget;
import com.bytedance.android.livesdk.impl.revenue.level.api.UserLevelApi;
import com.bytedance.android.livesdk.livesetting.level.LiveUserLevelBackEnableSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelTeaMonitorEnableSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelUnlockLevelSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelUpActionEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveNeedInitUserLevelFromCacheSetting;
import com.bytedance.android.livesdk.livesetting.performance.RoomSlowFunctionOptSetting;
import com.bytedance.android.livesdk.userservice.UserApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.Gson;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS6S0100200_5;
import org.json.JSONObject;
import tikcast.api.privilege.GradeConfig;
import tikcast.api.privilege.GradeScoreRule;
import tikcast.api.privilege.UserGrade;
import ujb.o;

/* loaded from: classes6.dex */
public final class UserLevelViewModel extends LiveWidgetViewModel implements IUserLevelService {
    public C73411SrX LJLILLLLZI;
    public CopyOnWriteArraySet<Double> LJLIL = new CopyOnWriteArraySet<>();
    public final boolean LJLJI = LiveNeedInitUserLevelFromCacheSetting.INSTANCE.getValue();

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void d90(UserLevelViewModel userLevelViewModel) {
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final Class<? extends LiveRecyclableWidget> ei() {
        return UserLevelWidget.class;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final RoomRecycleWidget xa0() {
        return null;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void Q1() {
        C73411SrX c73411SrX = this.LJLILLLLZI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final String eK() {
        String str = C28992BZk.LIZ;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void Qm0() {
        DataChannel dataChannel;
        C29800Bmm c29800Bmm;
        DataChannel dataChannel2;
        if (getDataChannel() != null && (dataChannel = getDataChannel()) != null && (c29800Bmm = (C29800Bmm) dataChannel.kv0(UserLevelChannel.class)) != null && (dataChannel2 = getDataChannel()) != null) {
            dataChannel2.rv0(UserLevelChannel.class, C29800Bmm.LIZIZ(c29800Bmm, null, null, 0, c29800Bmm.LIZ, 0, 14335));
            InterfaceC30442Bx8.e1.LIZJ(Double.valueOf(c29800Bmm.LIZ));
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final C29800Bmm gr() {
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null) {
            return (C29800Bmm) dataChannel.kv0(UserLevelChannel.class);
        }
        return null;
    }

    public final void hv0() {
        C30554Byw<String> c30554Byw;
        String LIZ;
        String LIZ2;
        DataChannel dataChannel;
        int i;
        C29800Bmm gr;
        if ((gr() != null && ((gr = gr()) == null || gr.LIZ != -1)) || (LIZ = (c30554Byw = InterfaceC30442Bx8.f1).LIZ()) == null || o.LJJJJJL(LIZ) || (LIZ2 = c30554Byw.LIZ()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(LIZ2);
        if (jSONObject.optInt("currentLevel", -1) < 0 || (dataChannel = getDataChannel()) == null) {
            return;
        }
        int optInt = jSONObject.optInt("currentLevel");
        long optLong = jSONObject.optLong("currentScore");
        Double LIZ3 = InterfaceC30442Bx8.e1.LIZ();
        if (LIZ3 != null) {
            i = (int) LIZ3.doubleValue();
        } else {
            i = 0;
        }
        int optInt2 = jSONObject.optInt("levelStatus");
        String optString = jSONObject.optString("avatarBorderColor");
        int optInt3 = jSONObject.optInt("barrageEffectConfig");
        dataChannel.rv0(UserLevelChannel.class, new C29800Bmm(optInt, optLong, optInt2, jSONObject.optLong("levelMinScore"), jSONObject.optLong("levelMaxScore"), jSONObject.optLong("secondToSleep"), Integer.valueOf(optInt3), optString, i, 1, jSONObject.optLong("version"), 28));
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final int Xy() {
        return C29799Bml.LJII;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final boolean fn0() {
        return C29799Bml.LIZIZ;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final CopyOnWriteArraySet<Double> jj0() {
        return this.LJLIL;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void I10(int i) {
        if (i > 1) {
            this.LJLILLLLZI = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(1L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 113));
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final int LB(long j) {
        DataChannel dataChannel;
        C29800Bmm c29800Bmm;
        if (C29799Bml.LIZIZ && getDataChannel() != null && (dataChannel = getDataChannel()) != null && (c29800Bmm = (C29800Bmm) dataChannel.kv0(UserLevelChannel.class)) != null) {
            long j2 = c29800Bmm.LIZIZ;
            int i = c29800Bmm.LIZ;
            long j3 = j2 + j;
            for (Map.Entry entry : ((LinkedHashMap) C29799Bml.LIZJ).entrySet()) {
                if (((Number) entry.getKey()).intValue() >= i && ((GradeScoreRule) entry.getValue()).gradeMinScore <= j3 && ((GradeScoreRule) entry.getValue()).gradeMaxScore > j3) {
                    return ((Number) entry.getKey()).intValue();
                }
            }
        }
        return 0;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final int MW(int i) {
        DataChannel dataChannel;
        C29800Bmm c29800Bmm;
        int i2;
        if (!C29799Bml.LIZIZ || getDataChannel() == null || (dataChannel = getDataChannel()) == null || (c29800Bmm = (C29800Bmm) dataChannel.kv0(UserLevelChannel.class)) == null || i >= (i2 = c29800Bmm.LIZ)) {
            return 0;
        }
        Iterator<Integer> it = C29799Bml.LJI.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (i + 1 <= intValue && intValue <= i2) {
                i3 = intValue;
            }
        }
        return i3;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void Un(double d) {
        this.LJLIL.add(Double.valueOf(d));
        InterfaceC30442Bx8.k0.LIZ(this.LJLIL);
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void bG(long j) {
        if (getDataChannel() == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AqS6S0100200_5 aqS6S0100200_5 = new AqS6S0100200_5(this, j, currentTimeMillis, 0);
        AqS6S0100200_5 aqS6S0100200_52 = new AqS6S0100200_5(this, j, currentTimeMillis, 1);
        C1EW.LIZ(((UserApi) Q7L.LIZIZ(UserApi.class)).updateSwitch(12L, j)).LJJJLIIL(new AfS54S0200000_5(aqS6S0100200_5, aqS6S0100200_52, 43), new AfS53S0100000_1(aqS6S0100200_52, 66));
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void en0(double d) {
        this.LJLIL.remove(Double.valueOf(d));
        InterfaceC30442Bx8.k0.LIZ(this.LJLIL);
    }

    public final void iv0(InterfaceC88472Yns interfaceC88472Yns) {
        C29800Bmm c29800Bmm;
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null) {
            c29800Bmm = (C29800Bmm) dataChannel.kv0(UserLevelChannel.class);
        } else {
            c29800Bmm = null;
        }
        C28992BZk.LIZIZ("enter_room", true);
        long currentTimeMillis = System.currentTimeMillis();
        C29796Bmi c29796Bmi = new C29796Bmi(currentTimeMillis, c29800Bmm, this);
        if (RoomSlowFunctionOptSetting.roomBuildOpt()) {
            ((UserLevelApi) Q7L.LIZIZ(UserLevelApi.class)).getUserLevelInfoJson(true).LJIJI(new C29802Bmo(currentTimeMillis, c29800Bmm, this)).LJFF(new C62705OjF()).LJJII(new AfS56S0100000_4(interfaceC88472Yns, 91), new AfS57S0100000_5(c29796Bmi, 114));
        } else {
            T28.LIZLLL(((UserLevelApi) Q7L.LIZIZ(UserLevelApi.class)).getUserLevelInfoJson(true)).LJJII(new C29801Bmn(this, c29800Bmm, currentTimeMillis, interfaceC88472Yns), new AfS57S0100000_5(c29796Bmi, 114));
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final boolean rh(int i) {
        DataChannel dataChannel;
        C29800Bmm c29800Bmm;
        int i2;
        if (!C29799Bml.LIZIZ || getDataChannel() == null || (dataChannel = getDataChannel()) == null || (c29800Bmm = (C29800Bmm) dataChannel.kv0(UserLevelChannel.class)) == null || i >= (i2 = c29800Bmm.LIZ)) {
            return false;
        }
        Iterator<Integer> it = C29799Bml.LJI.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (i + 1 <= intValue && intValue <= i2) {
                i3 = intValue;
            }
        }
        if (i3 <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final int tl0(List<BadgeStruct> list) {
        String str;
        int i = -1;
        if (list != null) {
            for (BadgeStruct badgeStruct : list) {
                if (badgeStruct != null && badgeStruct.badgeScene == 8) {
                    try {
                        CombineBadgeStruct combineBadgeStruct = badgeStruct.combineBadgeStruct;
                        if (combineBadgeStruct != null && (str = combineBadgeStruct.str) != null) {
                            i = CastIntegerProtector.parseInt(str);
                        } else {
                            i = 0;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return i;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void Rm(UserGrade userGrade, boolean z, String str, boolean z2) {
        int i;
        if (userGrade == null) {
            return;
        }
        if (kotlin.jvm.internal.o.LJ(str, "star_comment")) {
            i = 5;
        } else {
            i = 3;
        }
        kv0(this, userGrade, z, i, null, str, Boolean.valueOf(z2), 8);
    }

    public final List<GradeConfig> gv0(String str, C29800Bmm c29800Bmm, long j, C28467BFf<m> c28467BFf) {
        Integer num;
        g gVar;
        int i;
        long j2;
        Integer num2;
        long currentTimeMillis = System.currentTimeMillis();
        m mVar = null;
        if (c28467BFf != null && Integer.valueOf(c28467BFf.statusCode) != null && (c28467BFf == null || c28467BFf.statusCode != 0)) {
            if (c29800Bmm != null) {
                i = c29800Bmm.LIZ;
            } else {
                i = -1;
            }
            Integer valueOf = Integer.valueOf(i);
            if (c29800Bmm != null) {
                j2 = c29800Bmm.LIZIZ;
            } else {
                j2 = -1;
            }
            Long valueOf2 = Long.valueOf(j2);
            if (c28467BFf != null) {
                num2 = Integer.valueOf(c28467BFf.statusCode);
            } else {
                num2 = null;
            }
            C28992BZk.LIZJ(valueOf, valueOf2, -1, -1L, num2);
            C28992BZk.LJ(true, str, currentTimeMillis - j, true, Integer.valueOf(c28467BFf.statusCode));
        }
        long j3 = currentTimeMillis - j;
        if (c28467BFf != null) {
            num = Integer.valueOf(c28467BFf.statusCode);
        } else {
            num = null;
        }
        C28992BZk.LJ(true, str, j3, true, num);
        if (c28467BFf == null || c28467BFf.data == null) {
            return new ArrayList();
        }
        m mVar2 = c28467BFf.data;
        if (mVar2 == null) {
            mVar2 = new m();
        }
        j LJJIJ = mVar2.LJJIJ("grade_config");
        if (LJJIJ != null) {
            gVar = LJJIJ.LJIILLIIL();
        } else {
            gVar = null;
        }
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).qk0(C15380j0.LIZLLL(), String.valueOf(gVar), "user_level_upgrade_config");
        Gson gson = C09650Zl.LIZJ;
        List<GradeConfig> list = (List) GsonProtectorUtils.fromJson(gson, gVar, new C29803Bmp().getType());
        if (list == null) {
            list = new ArrayList<>();
        }
        j LJJIJ2 = mVar2.LJJIJ("user_grade");
        if (LJJIJ2 != null) {
            mVar = LJJIJ2.LJIIZILJ();
        }
        kv0(this, (UserGrade) GsonProtectorUtils.fromJson(gson, (j) mVar, UserGrade.class), false, 2, "enter_room", null, null, 48);
        C29799Bml.LIZ(list);
        return list;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void DK(boolean z, InterfaceC88472Yns<? super List<GradeConfig>, C76800UCe> interfaceC88472Yns, String str, Boolean bool, String str2) {
        C29800Bmm c29800Bmm;
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null) {
            c29800Bmm = (C29800Bmm) dataChannel.kv0(UserLevelChannel.class);
        } else {
            c29800Bmm = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C28992BZk.LIZIZ(str, z);
        C65814PsI.LIZ().getClass();
        T28.LIZLLL(((UserLevelApi) C65814PsI.LIZJ(UserLevelApi.class)).getUserLevelInfo(z)).LJJII(new C29798Bmk(z, str, currentTimeMillis, c29800Bmm, this, str2, bool, interfaceC88472Yns), new C29797Bmj(c29800Bmm, z, str, currentTimeMillis, this));
    }

    public final C29800Bmm jv0(UserGrade userGrade, boolean z, int i, String str, String str2, Boolean bool) {
        C29800Bmm c29800Bmm;
        boolean z2;
        long j;
        long j2;
        Integer num;
        String str3;
        int i2;
        long j3;
        String str4;
        String str5;
        DataChannel dataChannel;
        ImageModel imageModel = null;
        if (userGrade == null || getDataChannel() == null) {
            return null;
        }
        DataChannel dataChannel2 = getDataChannel();
        if (dataChannel2 == null || (c29800Bmm = (C29800Bmm) dataChannel2.kv0(UserLevelChannel.class)) == null) {
            c29800Bmm = new C29800Bmm(-1, 0L, 0, 0L, 0L, 0L, null, null, 0, 0, 0L, 16382);
        }
        int i3 = 0;
        if (userGrade.version > c29800Bmm.LJIILIIL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!LiveUserLevelBackEnableSetting.INSTANCE.getValue()) {
            z2 = false;
        }
        int i4 = c29800Bmm.LIZ;
        int i5 = userGrade.currentGrade;
        if (i4 > i5 && !z2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("viewModel currentLevel  = ");
            LIZ.append(c29800Bmm.LIZ);
            LIZ.append(" but api response is ");
            LIZ.append(userGrade.currentGrade);
            C0NB.LJ("UserLevelViewModel", X1D.LIZIZ(LIZ));
            if (i == 2) {
                C28992BZk.LIZJ(Integer.valueOf(c29800Bmm.LIZ), Long.valueOf(c29800Bmm.LIZIZ), Integer.valueOf(userGrade.currentGrade), Long.valueOf(userGrade.currentScore), -1);
            }
            return null;
        }
        long j4 = c29800Bmm.LIZIZ;
        long j5 = userGrade.currentScore;
        if (j4 > j5 && !z2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("viewModel currentScore  = ");
            LIZ2.append(c29800Bmm.LIZIZ);
            LIZ2.append(" but api response is ");
            LIZ2.append(userGrade.currentScore);
            C0NB.LJ("UserLevelViewModel", X1D.LIZIZ(LIZ2));
            if (i == 2) {
                C28992BZk.LIZJ(Integer.valueOf(c29800Bmm.LIZ), Long.valueOf(c29800Bmm.LIZIZ), Integer.valueOf(userGrade.currentGrade), Long.valueOf(userGrade.currentScore), -2);
            }
            return null;
        }
        BadgeStruct badgeStruct = userGrade.opacityBadge;
        if (badgeStruct == null) {
            badgeStruct = c29800Bmm.LIZJ;
        }
        BadgeStruct badgeStruct2 = userGrade.defaultGradeBadge;
        if (badgeStruct2 == null) {
            badgeStruct2 = c29800Bmm.LIZLLL;
        }
        if (C29799Bml.LIZIZ && getDataChannel() != null) {
            imageModel = (ImageModel) ((LinkedHashMap) C29799Bml.LJ).get(Integer.valueOf(i5));
        }
        int i6 = userGrade.gradeMode;
        GradeScoreRule gradeScoreRule = userGrade.gradeScoreRule;
        if (gradeScoreRule != null) {
            j = gradeScoreRule.gradeMinScore;
        } else {
            j = c29800Bmm.LJI;
        }
        if (gradeScoreRule != null) {
            j2 = gradeScoreRule.gradeMaxScore;
        } else {
            j2 = c29800Bmm.LJII;
        }
        long j6 = userGrade.timeToSleep;
        int i7 = userGrade.currentGrade;
        if (!C29799Bml.LIZIZ || getDataChannel() == null) {
            num = null;
        } else {
            num = (Integer) ((LinkedHashMap) C29799Bml.LIZLLL).get(Integer.valueOf(i7));
        }
        int i8 = userGrade.currentGrade;
        if (!C29799Bml.LIZIZ || getDataChannel() == null) {
            str3 = null;
        } else {
            str3 = (String) ((LinkedHashMap) C29799Bml.LJFF).get(Integer.valueOf(i8));
        }
        if (z) {
            i2 = userGrade.currentGrade;
        } else {
            Double LIZ3 = InterfaceC30442Bx8.e1.LIZ();
            if (LIZ3 != null) {
                i2 = (int) LIZ3.doubleValue();
            } else {
                i2 = 0;
            }
        }
        C29800Bmm LIZ4 = C29800Bmm.LIZ(i5, j5, badgeStruct, badgeStruct2, imageModel, i6, j, j2, j6, num, str3, i2, i, userGrade.version);
        DataChannel dataChannel3 = getDataChannel();
        if (dataChannel3 != null) {
            dataChannel3.rv0(UserLevelChannel.class, LIZ4);
        }
        if (!kotlin.jvm.internal.o.LJ(str, "user_level_data_holder")) {
            C29799Bml.LIZ = userGrade;
        }
        if (z) {
            InterfaceC30442Bx8.e1.LIZJ(Double.valueOf(LIZ4.LIZ));
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.mv0(C29049Baf.class);
        if (c29800Bmm.LJFF != 1 && LIZ4.LJFF == 1 && c29800Bmm.LJIIL != 1) {
            C28992BZk.LJFF(Integer.valueOf(c29800Bmm.LIZ), Long.valueOf(c29800Bmm.LIZIZ), Integer.valueOf(c29800Bmm.LJFF), Integer.valueOf(LIZ4.LIZ), Long.valueOf(LIZ4.LIZIZ), Integer.valueOf(LIZ4.LJFF));
            DataChannel dataChannel4 = getDataChannel();
            if (dataChannel4 != null) {
                dataChannel4.qv0(UserLevelEvent.class, C29788Bma.LIZ);
            }
            if (c29800Bmm.LJFF == 3 && (dataChannel = getDataChannel()) != null) {
                dataChannel.qv0(UserLevelEvent.class, C29790Bmc.LIZ);
            }
        }
        if (c29800Bmm.LJFF == 1 && LIZ4.LJFF == 2 && c29800Bmm.LJIIL != 1) {
            C28992BZk.LJFF(Integer.valueOf(c29800Bmm.LIZ), Long.valueOf(c29800Bmm.LIZIZ), Integer.valueOf(c29800Bmm.LJFF), Integer.valueOf(LIZ4.LIZ), Long.valueOf(LIZ4.LIZIZ), Integer.valueOf(LIZ4.LJFF));
        }
        if (c29800Bmm.LIZ >= 0) {
            C0NB.LJIIIZ("UserLevelViewModel", "nextLevel: " + LIZ4.LIZ + ", currentLevel: " + c29800Bmm.LIZ + ", scene: " + c29800Bmm.LJIIL);
            String str6 = "";
            if (LIZ4.LIZ > c29800Bmm.LIZ && c29800Bmm.LJIIL != 1 && UserLevelUpActionEnableSetting.INSTANCE.getValue()) {
                C28992BZk.LIZ = str2;
                int i9 = LIZ4.LIZ;
                boolean rh = rh(c29800Bmm.LIZ);
                int i10 = c29800Bmm.LIZ;
                Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
                long j7 = 0;
                if (room != null) {
                    j3 = room.getId();
                    if (room.getOwner() != null) {
                        j7 = room.getOwner().getId();
                    }
                } else {
                    j3 = 0;
                }
                long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
                if (rh) {
                    str4 = "big";
                } else {
                    str4 = "small";
                }
                if (i10 <= 0) {
                    str4 = "new";
                }
                BZI LIZ5 = C28787BRn.LIZ("livesdk_user_level_up_success");
                LIZ5.LJIIZILJ();
                LIZ5.LJIJJ(Integer.valueOf(kotlin.jvm.internal.o.LJ(bool, Boolean.TRUE) ? 1 : 0), "is_combo");
                LIZ5.LJIJJ(Long.valueOf(j3), "room_id");
                LIZ5.LJIJJ(Long.valueOf(j7), "anchor_id");
                if (str2 == null) {
                    str5 = "";
                } else {
                    str5 = str2;
                }
                LIZ5.LJIJJ(str5, "trigger_payment");
                LIZ5.LJIJJ(Long.valueOf(currentUserId), "user_id");
                LIZ5.LJIJJ(Integer.valueOf(i10), "up_before_user_level");
                LIZ5.LJIJJ(Integer.valueOf(i9), "user_level");
                LIZ5.LJIJJ(str4, "level_up_type");
                LIZ5.LJJIIJZLJL();
                DataChannel dataChannel5 = getDataChannel();
                if (dataChannel5 != null) {
                    dataChannel5.qv0(UserLevelEvent.class, new C29787BmZ(LIZ4));
                }
            }
            if (LIZ4.LIZIZ > c29800Bmm.LIZIZ) {
                Iterator<Integer> it = UserLevelUnlockLevelSetting.INSTANCE.getValue().iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (intValue > c29800Bmm.LIZ && intValue <= LIZ4.LIZ) {
                        i3++;
                    }
                }
                Integer valueOf = Integer.valueOf(c29800Bmm.LIZ);
                Long valueOf2 = Long.valueOf(c29800Bmm.LIZIZ);
                Integer valueOf3 = Integer.valueOf(c29800Bmm.LJFF);
                Integer valueOf4 = Integer.valueOf(LIZ4.LIZ);
                Long valueOf5 = Long.valueOf(LIZ4.LIZIZ);
                Integer valueOf6 = Integer.valueOf(LIZ4.LJFF);
                Integer valueOf7 = Integer.valueOf(i3);
                if (UserLevelTeaMonitorEnableSetting.INSTANCE.getValue()) {
                    try {
                        if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_level_updated", LiveLogMonitorSampleSetting.getSAMPLE_10())) {
                            BZI LIZ6 = C28787BRn.LIZ("livesdk_user_level_updated");
                            LIZ6.LJIIZILJ();
                            C28992BZk.LIZ(LIZ6);
                            LIZ6.LJIJJ(Integer.valueOf(kotlin.jvm.internal.o.LJ(bool, Boolean.TRUE) ? 1 : 0), "is_combo");
                            LIZ6.LJIJJ(valueOf, "current_grade");
                            LIZ6.LJIJJ(valueOf2, "current_score");
                            LIZ6.LJIJJ(valueOf3, "current_grade_mode");
                            LIZ6.LJIJJ(valueOf4, "grade");
                            LIZ6.LJIJJ(valueOf5, "score");
                            if (str2 != null) {
                                str6 = str2;
                            }
                            LIZ6.LJIJJ(str6, "trigger_payment");
                            LIZ6.LJIJJ(valueOf6, "grade_mode");
                            LIZ6.LJIJJ(str, WM7.SCENE_SERVICE);
                            LIZ6.LJIJJ(valueOf7, "cross_unlock_num");
                            LIZ6.LJJIIJZLJL();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return LIZ4;
    }

    public static /* synthetic */ void kv0(UserLevelViewModel userLevelViewModel, UserGrade userGrade, boolean z, int i, String str, String str2, Boolean bool, int i2) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            i = 3;
        }
        if ((i2 & 8) != 0) {
            str = "gift";
        }
        if ((i2 & 16) != 0) {
            str2 = "";
        }
        if ((i2 & 32) != 0) {
            bool = Boolean.FALSE;
        }
        userLevelViewModel.jv0(userGrade, z, i, str, str2, bool);
    }
}
