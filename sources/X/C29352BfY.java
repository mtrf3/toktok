package X;

import Y.AfS36S0101000_5;
import Y.AfS44S0300000_5;
import Y.AfS54S0200000_5;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.BfY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29352BfY extends AbstractC38123Exj<JSONObject, Object> {
    public C73411SrX LJLIL;
    public FollowPair LJLILLLLZI;

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
        C73411SrX c73411SrX = this.LJLIL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public static HashMap LJJI(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next, ""));
                }
                return hashMap;
            } catch (Exception e) {
                C0NB.LJII(e);
                return null;
            }
        }
        return null;
    }

    public final void LJJIFFI(FollowPair followPair, Context context) {
        if (followPair == null) {
            return;
        }
        this.LJLILLLLZI = followPair;
        if (!((C29374Bfu) B83.LIZ().LIZIZ()).isLogin()) {
            if (context instanceof ActivityC45651qj) {
                InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
                C29356Bfc c29356Bfc = new C29356Bfc();
                c29356Bfc.LIZ = C15380j0.LJIILJJIL(R.string.syn);
                c29356Bfc.LIZJ = -1;
                c29356Bfc.LJ = "search_result";
                c29356Bfc.LIZLLL = "recommend";
                c29356Bfc.LJFF = "follow";
                this.LJLIL = (C73411SrX) ((C29374Bfu) LIZIZ).LIZLLL(context, new C29377Bfx(c29356Bfc)).LJJJLIIL(new AfS44S0300000_5(context, this, followPair, 1), new AfS36S0101000_5(0, this, 5));
                return;
            }
            return;
        }
        if (followPair.LJ) {
            InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
            C29364Bfk c29364Bfk = new C29364Bfk();
            c29364Bfk.LIZIZ(followPair.LIZ);
            c29364Bfk.LJ(followPair.LIZIZ);
            C29364Bfk c29364Bfk2 = c29364Bfk;
            c29364Bfk2.LIZJ = followPair.LJFF;
            c29364Bfk2.LIZLLL = followPair.LIZLLL;
            c29364Bfk2.LJFF = followPair.LJI;
            this.LJLIL = (C73411SrX) ((C29374Bfu) LIZIZ2).LJIIIIZZ(new C29363Bfj(c29364Bfk2)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(0, this, 6), new AfS54S0200000_5(this, context, 11));
            return;
        }
        InterfaceC29405BgP LIZIZ3 = B83.LIZ().LIZIZ();
        C29357Bfd c29357Bfd = new C29357Bfd();
        c29357Bfd.LIZIZ(followPair.LIZ);
        c29357Bfd.LIZJ();
        c29357Bfd.LJ = followPair.LJFF;
        c29357Bfd.LJFF = followPair.LIZLLL;
        c29357Bfd.LIZIZ = followPair.followStatus;
        this.LJLIL = (C73411SrX) ((C29374Bfu) LIZIZ3).LJIJJ(new C29360Bfg(c29357Bfd)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(0, this, 7), new AfS36S0101000_5(0, this, 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.BfD] */
    @Override // X.AbstractC38123Exj
    public final void invoke(JSONObject jSONObject, C38131Exr c38131Exr) {
        long j;
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("type");
        final JSONObject optJSONObject = jSONObject2.optJSONObject("args");
        if (optJSONObject == null) {
            finishWithFailure();
            return;
        }
        if (TextUtils.equals("follow", optString)) {
            Context context = c38131Exr.LIZ;
            long parseLong = CastLongProtector.parseLong(JSONObjectProtectorUtils.getString(optJSONObject, "user_id"));
            try {
                j = CastLongProtector.parseLong(JSONObjectProtectorUtils.getString(optJSONObject, "room_id"));
            } catch (Exception e) {
                C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
                StackTraceElement[] stackTrace = e.getStackTrace();
                LJIILIIL.getClass();
                C0NE.LJIIL(5, stackTrace);
                j = 0;
            }
            optJSONObject.optString("from_label");
            optJSONObject.optString("url");
            FollowPair followPair = new FollowPair();
            followPair.LIZLLL = EnumC29290BeY.FromWeb;
            followPair.LIZ = parseLong;
            followPair.LIZIZ = j;
            followPair.LJ = true;
            HashMap<String, String> LJJI = LJJI(optJSONObject.optJSONObject("send_log"));
            followPair.LJFF = LJJI;
            if (LJJI != null && ("program_list".equals(LJJI.get("click_user_position")) || "program_list_new".equals(LJJI.get("click_user_position")))) {
                followPair.LJI = true;
            }
            LJJIFFI(followPair, context);
            return;
        }
        if (TextUtils.equals("unfollow", optString)) {
            final Context context2 = c38131Exr.LIZ;
            final long parseLong2 = CastLongProtector.parseLong(JSONObjectProtectorUtils.getString(optJSONObject, "user_id"));
            final String optString2 = optJSONObject.optString("from_label", "");
            final String optString3 = optJSONObject.optString("url", "");
            ((C29374Bfu) B83.LIZ().LIZIZ()).LJIJI(C15380j0.LJIILJJIL(R.string.spu), new DialogInterface.OnClickListener(optJSONObject, parseLong2, optString3, optString2, context2) { // from class: X.BfD
                public final /* synthetic */ JSONObject LJLILLLLZI;
                public final /* synthetic */ long LJLJI;
                public final /* synthetic */ String LJLJJI;
                public final /* synthetic */ Context LJLJJL;

                {
                    this.LJLJJI = optString2;
                    this.LJLJJL = context2;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2;
                    C29352BfY c29352BfY = C29352BfY.this;
                    JSONObject jSONObject3 = this.LJLILLLLZI;
                    long j2 = this.LJLJI;
                    Context context3 = this.LJLJJL;
                    c29352BfY.getClass();
                    try {
                        i2 = JSONObjectProtectorUtils.getInt(jSONObject3, "follow_status");
                    } catch (Throwable unused) {
                        i2 = 0;
                    }
                    FollowPair followPair2 = new FollowPair();
                    followPair2.followStatus = i2;
                    followPair2.LIZLLL = EnumC29290BeY.FromWeb;
                    followPair2.LIZ = j2;
                    followPair2.LJFF = C29352BfY.LJJI(jSONObject3.optJSONObject("send_log"));
                    c29352BfY.LJJIFFI(followPair2, context3);
                }
            }, context2, optString2, parseLong2);
            return;
        }
        finishWithFailure();
    }
}
