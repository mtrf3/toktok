package X;

import Y.ARunnableS49S0100000_13;
import android.content.Context;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterPunishCardOptSetting;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import webcast.data.AppealInfo;
import webcast.data.RealtimeViolationRecord;

/* loaded from: classes14.dex */
public final class UEQ extends AbstractC029409q<RecyclerView.ViewHolder> {
    public static final SimpleDateFormat LJLJLJ;
    public final Context LJLIL;
    public final DataChannel LJLILLLLZI;
    public List<RealtimeViolationRecord> LJLJI;
    public final java.util.Map<UEU, RealtimeViolationRecord> LJLJJI = new LinkedHashMap();
    public Handler LJLJJL;
    public boolean LJLJJLL;
    public ARunnableS49S0100000_13 LJLJL;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(simpleDateFormat.getCalendar().getTimeZone());
        LJLJLJ = simpleDateFormat;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<RealtimeViolationRecord> list = this.LJLJI;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void LJLLLLLL(RealtimeViolationRecord realtimeViolationRecord) {
        String str;
        PunishEventInfo punishEventInfo;
        PunishEventInfo punishEventInfo2;
        BZI LIZ = C28787BRn.LIZ("livesdk_appeal_click");
        LIZ.LJIILLIIL(this.LJLILLLLZI);
        String str2 = null;
        if (realtimeViolationRecord != null && (punishEventInfo2 = realtimeViolationRecord.punishInfo) != null) {
            str = punishEventInfo2.punishType;
        } else {
            str = null;
        }
        LIZ.LJIJJ(str, "violation_type");
        if (realtimeViolationRecord != null && (punishEventInfo = realtimeViolationRecord.punishInfo) != null) {
            str2 = punishEventInfo.punishId;
        }
        LIZ.LJIJJ(str2, "record_id");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        C65777Prh.LIZJ(this.LJLJJI).remove(holder);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        RealtimeViolationRecord realtimeViolationRecord;
        UER uer;
        Boolean bool;
        UES ues;
        o.LJIIIZ(holder, "holder");
        List<RealtimeViolationRecord> list = this.LJLJI;
        if (list == null || (realtimeViolationRecord = (RealtimeViolationRecord) ListProtector.get(list, i)) == null) {
            return;
        }
        if ((holder instanceof UES) && (ues = (UES) holder) != null) {
            ues.LJLJJL.setText(realtimeViolationRecord.title);
            C47121t6 c47121t6 = ues.LJLJJLL;
            String str = realtimeViolationRecord.reason;
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.mfr);
            String str2 = "";
            if (LJIILJJIL == null) {
                LJIILJJIL = "";
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a1.LJ(LJIILJJIL, ": ", str));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.LJLIL.getResources().getColor(R.color.a16)), 0, LJIILJJIL.length() + 1, 33);
            C23010vJ.LIZJ(this.LJLIL, spannableStringBuilder, 0, LJIILJJIL.length() + 1, 33, 5, 600);
            c47121t6.setText(spannableStringBuilder);
            if (realtimeViolationRecord.suggestion.length() > 0) {
                C47121t6 c47121t62 = ues.LJLJL;
                String str3 = realtimeViolationRecord.suggestion;
                String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.mfs);
                if (LJIILJJIL2 != null) {
                    str2 = LJIILJJIL2;
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a1.LJ(str2, ": ", str3));
                spannableStringBuilder2.setSpan(new ForegroundColorSpan(this.LJLIL.getResources().getColor(R.color.a16)), 0, str2.length() + 1, 33);
                C23010vJ.LIZJ(this.LJLIL, spannableStringBuilder2, 0, str2.length() + 1, 33, 5, 600);
                c47121t62.setText(spannableStringBuilder2);
            } else {
                C29306Beo.LJIIIZ(ues.LJLJL);
            }
            ues.LJLILLLLZI.setText(LJLJLJ.format(new Date(realtimeViolationRecord.startTime * 1000)));
            if (realtimeViolationRecord.type == 2) {
                this.LJLJJI.put(ues, realtimeViolationRecord);
            } else {
                C29306Beo.LJIIIZ(ues.LJLJJI);
                C29306Beo.LJIIIZ(ues.LJLJI);
            }
            ues.LJLIL.setBackground(C04270Et.LIZIZ(this.LJLIL, R.drawable.coj));
            LJLZ(realtimeViolationRecord, holder, false);
        }
        if ((holder instanceof UER) && (uer = (UER) holder) != null) {
            uer.LJLJJI.setText(realtimeViolationRecord.title);
            uer.LJLJJL.setText(realtimeViolationRecord.reason);
            uer.LJLIL.setText(realtimeViolationRecord.issueTimeText);
            C47121t6 c47121t63 = uer.LJLJJLL;
            AppealInfo appealInfo = realtimeViolationRecord.appealInfo;
            if (appealInfo != null) {
                bool = Boolean.valueOf(appealInfo.showAppeal);
            } else {
                bool = null;
            }
            C29306Beo.LJJLIIIJJI(c47121t63, C29306Beo.LJJIFFI(bool));
            uer.N(realtimeViolationRecord);
            this.LJLJJI.remove(uer);
            if (realtimeViolationRecord.status == 0 && (realtimeViolationRecord.type == 1 || realtimeViolationRecord.endTime - (C30725C4b.LIZ() / 1000) > 0)) {
                LJLZ(realtimeViolationRecord, holder, false);
                if (realtimeViolationRecord.type == 2) {
                    int LIZ = (int) (((realtimeViolationRecord.endTime - (C30725C4b.LIZ() / 1000)) / 86400) + 1);
                    if (LIZ > 1) {
                        uer.LJLJI.setText(C15380j0.LJIIIIZZ(R.plurals.p5, LIZ, Integer.valueOf(LIZ)));
                    } else {
                        this.LJLJJI.put(uer, realtimeViolationRecord);
                    }
                } else {
                    uer.LJLJI.setText(R.string.o6v);
                }
                uer.itemView.setBackground(C04270Et.LIZIZ(this.LJLIL, R.drawable.coj));
                C87277YNd.LJJIIJZLJL(uer.LJLJI, R.color.acm);
                uer.LJLILLLLZI.setIconTint(C15380j0.LIZIZ(R.color.acm));
            } else {
                uer.L((UEU) holder, realtimeViolationRecord);
            }
        }
        if (i != getItemCount() - 1) {
            return;
        }
        Handler handler = new Handler(C16880lQ.LLJJJJ());
        this.LJLJJL = handler;
        ARunnableS49S0100000_13 aRunnableS49S0100000_13 = new ARunnableS49S0100000_13(this, 187);
        this.LJLJL = aRunnableS49S0100000_13;
        handler.post(aRunnableS49S0100000_13);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder ues;
        o.LJIIIZ(parent, "parent");
        if (LiveCenterPunishCardOptSetting.INSTANCE.isEnable()) {
            ues = new UER(this, C29306Beo.LJIIIIZZ(R.layout.dbb, parent, false));
        } else {
            ues = new UES(this, C29306Beo.LJIIIIZZ(R.layout.dba, parent, false));
        }
        C0AX.LIZ(parent, ues.itemView, R.id.lj7);
        View view = ues.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (ues.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(ues.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) ues.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(ues.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = ues.getClass().getName();
        return ues;
    }

    public UEQ(Context context, DataChannel dataChannel, List<RealtimeViolationRecord> list) {
        this.LJLIL = context;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = list;
    }

    public static void LJLZ(RealtimeViolationRecord realtimeViolationRecord, RecyclerView.ViewHolder viewHolder, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        AppealInfo appealInfo;
        Integer valueOf;
        String str6;
        BZI LIZ = C28787BRn.LIZ("livesdk_violation_record_card");
        if (z) {
            str = "grey";
        } else {
            str = "red";
        }
        LIZ.LJIJJ(str, "card_color");
        PunishEventInfo punishEventInfo = realtimeViolationRecord.punishInfo;
        Boolean bool = null;
        if (punishEventInfo != null) {
            str2 = punishEventInfo.punishId;
        } else {
            str2 = null;
        }
        LIZ.LJIJJ(str2, "record_id");
        PunishEventInfo punishEventInfo2 = realtimeViolationRecord.punishInfo;
        if (punishEventInfo2 != null) {
            str3 = punishEventInfo2.punishType;
        } else {
            str3 = null;
        }
        LIZ.LJIJJ(str3, "violation_type");
        PunishEventInfo punishEventInfo3 = realtimeViolationRecord.punishInfo;
        if (punishEventInfo3 != null) {
            str4 = punishEventInfo3.punishReason;
        } else {
            str4 = null;
        }
        LIZ.LJIJJ(str4, "violation_reason");
        LIZ.LJIJJ(Integer.valueOf(viewHolder.getBindingAdapterPosition() + 1), "client_order");
        if (z) {
            str5 = "restriction_end";
        } else {
            str5 = "restriction";
        }
        LIZ.LJIJJ(str5, "restriction_status");
        AppealInfo appealInfo2 = realtimeViolationRecord.appealInfo;
        if (appealInfo2 != null) {
            bool = Boolean.valueOf(appealInfo2.showAppeal);
        }
        if (!C29306Beo.LJIL(bool) && (appealInfo = realtimeViolationRecord.appealInfo) != null && (valueOf = Integer.valueOf(appealInfo.appealStatus)) != null) {
            if (valueOf.intValue() == 1) {
                str6 = "appeal_in_progress";
            } else if (valueOf.intValue() == 3) {
                str6 = "appeal_not_approved";
            } else if (valueOf.intValue() == 0) {
                str6 = "appeal";
            } else if (valueOf.intValue() == 2) {
                str6 = "appeal_approved";
            }
            LIZ.LJIJJ(str6, "appeal_status");
            LIZ.LJJIIJZLJL();
        }
        str6 = "no_appeal";
        LIZ.LJIJJ(str6, "appeal_status");
        LIZ.LJJIIJZLJL();
    }
}
