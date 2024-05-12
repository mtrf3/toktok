package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C022406y;
import X.C16880lQ;
import X.C170626mo;
import X.C188727au;
import X.C27739Aud;
import X.C2U8;
import X.C34K;
import X.C41732GZk;
import X.C43021GuX;
import X.C43022GuY;
import X.C43023GuZ;
import X.C43025Gub;
import X.C43027Gud;
import X.C43937HMf;
import X.C44336Hae;
import X.C44339Hah;
import X.C44343Hal;
import X.C5L7;
import X.C60903NvH;
import X.C76800UCe;
import X.C7TR;
import X.EnumC42934Gt8;
import X.FMX;
import X.H78;
import X.InterfaceC65784Pro;
import X.P5A;
import X.X1D;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.anchor.model.WikiAnchor;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scheduler.PublishBroadcastReceiver;
import com.ss.android.ugc.aweme.scheduler.PublishService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.sharedar.network.API;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.ss.android.vesdk.VEUtils;
import com.ss.ugc.effectplatform.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class AqS62S1200000_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        int type = EnumC42934Gt8.WIKIPEDIA.getTYPE();
        String str = this.s0;
        String str2 = ((AddWikiActivity) this.l1).LJLL;
        if (str2 != null) {
            C2U8.LIZ(new C7TR(new AnchorTransData(type, C27739Aud.LJI(new WikiAnchor(str, str2)), this.s0, null, 1, null, null, false, null, null, null, null, null, false, 16360, null)));
            ((AddWikiActivity) this.l1).finish();
            C188727au c188727au = (C188727au) this.l2;
            String str3 = ((AddWikiActivity) this.l1).LJLL;
            if (str3 != null) {
                c188727au.getClass();
                c188727au.LJIIIZ("language", str3);
                c188727au.LJIIIZ("wiki_entry", this.s0);
                c188727au.LJIIIZ("key_word", ((AddWikiActivity) this.l1).LJLJLJ);
                c188727au.LIZLLL(1, "status");
                c188727au.LJIIIZ("content_source", C16880lQ.LLJJIJIIJIL(((AddWikiActivity) this.l1).getIntent(), "content_source"));
                c188727au.LJIIIZ("content_type", C16880lQ.LLJJIJIIJIL(((AddWikiActivity) this.l1).getIntent(), "content_type"));
                FMX.LJIIL("add_wiki", c188727au.LIZ);
                return;
            }
            o.LJIJI("language");
            throw null;
        }
        o.LJIJI("language");
        throw null;
    }

    public static final Object invoke$0(AqS62S1200000_7 aqS62S1200000_7) {
        C43022GuY c43022GuY;
        try {
            Object fromJson = GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), ((Keva) C43025Gub.LIZIZ.getValue()).getString("ai_music_list", "[]"), new C43027Gud().getType());
            o.LJIIIIZZ(fromJson, "{\n            GsonProvid…E, \"[]\"), type)\n        }");
            c43022GuY = (C43022GuY) fromJson;
        } catch (s unused) {
            c43022GuY = new C43022GuY(0);
        }
        if (c43022GuY.LIZ != null && (!r0.isEmpty())) {
            List<MusicModel> list = c43022GuY.LIZ;
            C43023GuZ c43023GuZ = new C43023GuZ(c43022GuY.LJ, c43022GuY.LIZJ, c43022GuY.LIZLLL, c43022GuY.LJFF, System.currentTimeMillis() - ((C43021GuX) aqS62S1200000_7.l1).LJFF, list, true);
            ((C43021GuX) aqS62S1200000_7.l1).LJIIIIZZ.onNext(c43023GuZ);
            ((C43021GuX) aqS62S1200000_7.l1).LJ.onNext(c43023GuZ);
        } else {
            C43021GuX.LIZIZ((C43021GuX) aqS62S1200000_7.l1, (List) aqS62S1200000_7.l2, aqS62S1200000_7.s0, true, 2);
        }
        ((C43021GuX) aqS62S1200000_7.l1).LJIIJJI = false;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS62S1200000_7 aqS62S1200000_7) {
        int i;
        PublishService publishService = (PublishService) aqS62S1200000_7.l1;
        String str = aqS62S1200000_7.s0;
        Bitmap bitmap = (Bitmap) aqS62S1200000_7.l2;
        publishService.getClass();
        Intent intent = new Intent(publishService, (Class<?>) PublishBroadcastReceiver.class);
        intent.putExtra("creation_id", str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("putExtra creationId:");
        LIZ.append(str);
        C41732GZk.LIZLLL(X1D.LIZIZ(LIZ));
        new Intent(publishService, (Class<?>) PublishBroadcastReceiver.class).putExtra("DEBUG_MSG", "MSG_SUCCESS");
        String string = publishService.getString(R.string.thr);
        o.LJIIIIZZ(string, "context.getString(R.string.uploading_failed)");
        String string2 = publishService.getString(R.string.ths);
        o.LJIIIIZZ(string2, "context.getString(R.string.uploading_failed_retry)");
        C022406y LIZIZ = PublishService.LIZIZ(publishService, publishService, string, string2, bitmap);
        if (Build.VERSION.SDK_INT >= 23) {
            i = 67108864;
        } else {
            i = 0;
        }
        LIZIZ.LJI = PendingIntent.getBroadcast(publishService, 6, intent, i);
        C5L7.LIZIZ();
        LIZIZ.LJII(16, true);
        Notification LIZIZ2 = LIZIZ.LIZIZ();
        o.LJIIIIZZ(LIZIZ2, "getBuilder(context, cont…rue)\n            .build()");
        return LIZIZ2;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS62S1200000_7 aqS62S1200000_7) {
        aqS62S1200000_7.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS62S1200000_7 aqS62S1200000_7) {
        JSONArray put = new JSONArray().put(((User) aqS62S1200000_7.l1).getUid());
        JSONObject jSONObject = new JSONObject();
        C44336Hae c44336Hae = (C44336Hae) aqS62S1200000_7.l2;
        String str = aqS62S1200000_7.s0;
        c44336Hae.getClass();
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("aweme").authority("openShoot").appendQueryParameter("type", "use_sticker");
        Effect effect = ((C44343Hal) c44336Hae.LJLJJL.LIZ(c44336Hae, C44336Hae.LJLJL[1])).LJIIIIZZ;
        if (effect != null) {
            String uri = appendQueryParameter.appendQueryParameter("sticker_id", effect.getEffect_id()).appendQueryParameter("session", str).appendQueryParameter("host_uid", C60903NvH.LJIIJJI().getAccountService().getCurrentUserID()).build().toString();
            o.LJIIIIZZ(uri, "Builder()\n            .s…)\n            .toString()");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("schema: ");
            LIZ.append(uri);
            H78.LIZIZ("SharedAR", X1D.LIZIZ(LIZ));
            jSONObject.put("schema", uri);
            jSONObject.put("notice_type", "shared_ar_effect");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String jSONArray = put.toString();
            o.LJIIIIZZ(jSONArray, "inviteeIds.toString()");
            linkedHashMap.put("receiver_ids", jSONArray);
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "content.toString()");
            linkedHashMap.put("notice_content", ujb.o.LJJJJZ(jSONObject2, "\\", "", false));
            C34K c34k = new C34K();
            try {
                BaseResponse baseResponse = ((API) C44339Hah.LIZ.getValue()).inviteFriend(linkedHashMap).execute().LIZIZ;
                if (baseResponse.status_code == 0) {
                    c34k.element = true;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("invite friend response: ");
                LIZ2.append(baseResponse);
                H78.LIZIZ("SharedAR", X1D.LIZIZ(LIZ2));
            } catch (Exception e) {
                H78.LIZLLL("SharedAR", e);
            }
            C44336Hae c44336Hae2 = (C44336Hae) aqS62S1200000_7.l2;
            c44336Hae2.LIZJ(new AqS96S0300000_7(c44336Hae2, c34k, (User) aqS62S1200000_7.l1, 25));
            return C76800UCe.LIZ;
        }
        o.LJIJI("effect");
        throw null;
    }

    public static final Object invoke$4(AqS62S1200000_7 aqS62S1200000_7) {
        int i;
        if (C170626mo.LIZ(aqS62S1200000_7.s0)) {
            IAVInfoService.IGetInfoCallback iGetInfoCallback = (IAVInfoService.IGetInfoCallback) aqS62S1200000_7.l1;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(Integer.valueOf(TEVideoUtils.nativeCheckMp3File(aqS62S1200000_7.s0)));
            }
        } else {
            IAVInfoService.IGetInfoCallback iGetInfoCallback2 = (IAVInfoService.IGetInfoCallback) aqS62S1200000_7.l1;
            if (iGetInfoCallback2 != null) {
                if (C170626mo.LIZJ((Context) aqS62S1200000_7.l2, aqS62S1200000_7.s0)) {
                    i = 0;
                } else {
                    i = -1;
                }
                iGetInfoCallback2.finish(Integer.valueOf(i));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS62S1200000_7 aqS62S1200000_7) {
        VEUtils.getVideoFrames(aqS62S1200000_7.s0, (int[]) aqS62S1200000_7.l1, (P5A) aqS62S1200000_7.l2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1200000_7(C43021GuX c43021GuX, String str, List list, int i) {
        super(0);
        this.$t = i;
        this.l1 = c43021GuX;
        this.l2 = list;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1200000_7(Context context, String str, IAVInfoService.IGetInfoCallback iGetInfoCallback, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = iGetInfoCallback;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1200000_7(User user, C44336Hae c44336Hae, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = user;
        this.l2 = c44336Hae;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1200000_7(PublishService publishService, String str, Bitmap bitmap, int i) {
        super(0);
        this.$t = i;
        this.l1 = publishService;
        this.s0 = str;
        this.l2 = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1200000_7(String str, AddWikiActivity addWikiActivity, C188727au c188727au, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = addWikiActivity;
        this.l2 = c188727au;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S1200000_7(String str, int[] iArr, C43937HMf c43937HMf, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = iArr;
        this.l2 = c43937HMf;
    }
}
