package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostTopicClubUrlListSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Tuc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76150Tuc extends AbstractC31414CUo<C76149Tub, C76153Tuf> {
    public static final void LJI() {
        String str;
        if (C74838TYs.LJ().LJIIIZ) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.oo5));
            return;
        }
        EnumC75620Tm4 LLII = C8E.LIZLLL().LLII();
        C32364Cn2 c32364Cn2 = new C32364Cn2(LiveCoHostTopicClubUrlListSetting.INSTANCE.getCohost_topic_club_plaza());
        if (LLII == EnumC75620Tm4.Invited || LLII == EnumC75620Tm4.Applied) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c32364Cn2.LIZJ("is_inviting", str);
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(C15380j0.LIZLLL(), UriProtector.parse(c32364Cn2.LIZLLL()));
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(C76153Tuf c76153Tuf, C76149Tub c76149Tub) {
        String str;
        String str2;
        String str3;
        C76153Tuf holder = c76153Tuf;
        C76149Tub item = c76149Tub;
        String str4 = "";
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        if (C15380j0.LJIIZILJ()) {
            str = "live_cohost_topic_entrance_v1_icon_rtl.png";
        } else {
            str = "live_cohost_topic_entrance_v1_icon.png";
        }
        Object value = holder.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-topicRightIconView>(...)");
        C15490jB.LJ((View) value, "tiktok_live_match_redesign_resource", str);
        Object value2 = holder.LJLL.getValue();
        o.LJIIIIZZ(value2, "<get-hotClickArea>(...)");
        C29306Beo.LJJJLL((View) value2, 500L, new AqS179S0100000_13(this, 688));
        Object value3 = holder.LJLJLJ.getValue();
        o.LJIIIIZZ(value3, "<get-topicEntranceBtn>(...)");
        C29306Beo.LJJJLL((View) value3, 500L, new AqS179S0100000_13(this, 689));
        Object value4 = holder.LJLIL.getValue();
        o.LJIIIIZZ(value4, "<get-topicTitleLeft>(...)");
        ((TextView) value4).setText(C15380j0.LJIILJJIL(R.string.oo0));
        Object value5 = holder.LJLJI.getValue();
        o.LJIIIIZZ(value5, "<get-topicDesc>(...)");
        ((TextView) value5).setText(C15380j0.LJIILJJIL(R.string.one));
        Object value6 = holder.LJLJLJ.getValue();
        o.LJIIIIZZ(value6, "<get-topicEntranceBtn>(...)");
        ((C2A7) value6).setText(C15380j0.LJIILJJIL(R.string.onf));
        try {
            Date date = new Date(item.LJLJJLL);
            Date date2 = new Date(item.LJLJL);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd", Locale.ROOT);
            simpleDateFormat.setLenient(false);
            String timeStartString = simpleDateFormat.format(date);
            o.LJIIIIZZ(timeStartString, "timeStartString");
            List LJLJJL = s.LJLJJL(timeStartString, new String[]{"-"}, 0, 6);
            int parseInt = CastIntegerProtector.parseInt((String) ListProtector.get(LJLJJL, 0));
            int parseInt2 = CastIntegerProtector.parseInt((String) ListProtector.get(LJLJJL, 1));
            String timeEndString = simpleDateFormat.format(date2);
            o.LJIIIIZZ(timeEndString, "timeEndString");
            List LJLJJL2 = s.LJLJJL(timeEndString, new String[]{"-"}, 0, 6);
            int parseInt3 = CastIntegerProtector.parseInt((String) ListProtector.get(LJLJJL2, 0));
            int parseInt4 = CastIntegerProtector.parseInt((String) ListProtector.get(LJLJJL2, 1));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(parseInt);
            LIZ.append('.');
            LIZ.append(parseInt2);
            LIZ.append('-');
            LIZ.append(parseInt3);
            LIZ.append('.');
            LIZ.append(parseInt4);
            str2 = X1D.LIZIZ(LIZ);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(e.getMessage());
            LIZ2.append("generateTimeRangeTextError");
            C0NB.LJ("MultiCoHostTopicViewBinderV1", X1D.LIZIZ(LIZ2));
            str2 = "";
        }
        Object value7 = holder.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value7, "<get-topicTitleTimeRange>(...)");
        ((TextView) value7).setText(str2);
        C29306Beo.LJJLIIIJJI(holder.L(), true);
        C29306Beo.LJJLIIIJJI(holder.M(), true);
        C29306Beo.LJJLIIIJJI(holder.N(), true);
        C29306Beo.LJJLIIIJJI(holder.P(), true);
        long j = item.LJLLJ;
        if (j <= 0) {
            C87277YNd.LJJIIZI(holder.P());
        } else {
            try {
                Formatter formatter = new Formatter();
                String LJIILJJIL = C15380j0.LJIILJJIL(R.string.onb);
                if (LJIILJJIL == null) {
                    str3 = "";
                } else {
                    str3 = ujb.o.LJJJJZ(LJIILJJIL, "%d", "%,d", false);
                }
                Formatter format = formatter.format(str3, Long.valueOf(j));
                if (format != null) {
                    str4 = format.toString();
                } else {
                    str4 = null;
                }
            } catch (Exception e2) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(e2.getMessage());
                LIZ3.append("generateJointNumStringError");
                C0NB.LJ("MultiCoHostTopicViewBinderV1", X1D.LIZIZ(LIZ3));
            }
            holder.P().setText(str4);
        }
        int size = item.LJLLILLLL.size();
        if (size != 0) {
            if (size != 1) {
                if (size != 2) {
                    holder.L().setAvatar((ImageModel) ListProtector.get(item.LJLLILLLL, 0));
                    holder.M().setAvatar((ImageModel) ListProtector.get(item.LJLLILLLL, 1));
                    holder.N().setAvatar((ImageModel) ListProtector.get(item.LJLLILLLL, 2));
                    C29306Beo.LJJLIIIJ((int) C87277YNd.LJIIJ(58), holder.P());
                    return;
                }
                holder.L().setAvatar((ImageModel) ListProtector.get(item.LJLLILLLL, 0));
                holder.M().setAvatar((ImageModel) ListProtector.get(item.LJLLILLLL, 1));
                C29306Beo.LJJLIIIJJI(holder.N(), false);
                C29306Beo.LJJLIIIJ((int) C87277YNd.LJIIJ(46), holder.P());
                return;
            }
            holder.L().setAvatar((ImageModel) ListProtector.get(item.LJLLILLLL, 0));
            C29306Beo.LJJLIIIJJI(holder.M(), false);
            C29306Beo.LJJLIIIJJI(holder.N(), false);
            C29306Beo.LJJLIIIJ((int) C87277YNd.LJIIJ(34), holder.P());
            return;
        }
        C29306Beo.LJJLIIIJJI(holder.L(), false);
        C29306Beo.LJJLIIIJJI(holder.M(), false);
        C29306Beo.LJJLIIIJJI(holder.N(), false);
        C29306Beo.LJJLIIIJJI(holder.P(), false);
    }

    @Override // X.AbstractC31414CUo
    public final C76153Tuf LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.d8a, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …     false,\n            )");
        return new C76153Tuf(LLLLIILL);
    }
}
