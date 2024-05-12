package X;

import android.app.Activity;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.music.service.ProfileMusicTabService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.9ll, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C246419ll extends AbstractC65781Prl implements InterfaceC88472Yns<M78, C76800UCe> {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ ProfileMusicTabService LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;
    public final /* synthetic */ C76732zl LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C246419ll(View view, ProfileMusicTabService profileMusicTabService, ActivityC45651qj activityC45651qj, C76732zl c76732zl) {
        super(1);
        this.LJLIL = view;
        this.LJLILLLLZI = profileMusicTabService;
        this.LJLJI = activityC45651qj;
        this.LJLJJI = c76732zl;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(M78 m78) {
        ViewGroup viewGroup;
        int LIZ;
        M78 popupStateWrapper = m78;
        o.LJIIIZ(popupStateWrapper, "popupStateWrapper");
        View view = this.LJLIL;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            if (C53765L8f.LJIIJJI()) {
                LIZ = 0;
            } else {
                C57092Lx.LIZ.getClass();
                LIZ = C61447O9r.LIZ();
            }
            final String str = C242169eu.LIZ().url;
            if (str.length() == 0) {
                popupStateWrapper.LIZ();
            } else {
                final AKH akh = new AKH(viewGroup);
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_bell;
                c2068389v.LJ = Integer.valueOf(R.attr.go);
                akh.LIZLLL(new AqS167S0100000_1(c2068389v, 15), false);
                final Activity activity = this.LJLJI;
                final C76732zl c76732zl = this.LJLJJI;
                String string = activity.getString(R.string.bu6);
                o.LJIIIIZZ(string, "activity.getString(R.str…ofilePage_bottomToastCTA)");
                String string2 = activity.getString(R.string.bu7);
                o.LJIIIIZZ(string2, "activity.getString(R.str…filePage_bottomToastDesc)");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C42398GkU.LIZIZ(string2, ' '));
                SpannableString spannableString = new SpannableString(string);
                spannableString.setSpan(new ClickableSpan() { // from class: X.9lk
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View widget) {
                        o.LJIIIZ(widget, "widget");
                        SmartRouter.buildRoute(activity, str).open();
                        c76732zl.element = 1;
                        akh.LIZ();
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint ds) {
                        o.LJIIIZ(ds, "ds");
                        Integer LJI = C79045V0n.LJI(R.attr.eb, activity);
                        if (LJI != null) {
                            ds.setColor(LJI.intValue());
                        }
                        ds.setUnderlineText(false);
                    }
                }, 0, spannableString.length(), 17);
                SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) spannableString);
                o.LJIIIIZZ(append, "builder.append(clickableSpan)");
                A21 a21 = akh.LIZ;
                a21.LJ = append;
                a21.LJIIIZ = 0;
                a21.LJIILIIL = true;
                a21.LIZJ = false;
                AqS108S0300000_4 aqS108S0300000_4 = new AqS108S0300000_4(popupStateWrapper, this.LJLILLLLZI, this.LJLJJI, 15);
                A21 a212 = akh.LIZ;
                a212.LJIIL = aqS108S0300000_4;
                a212.LJIIIIZZ = LIZ;
                akh.LIZIZ();
                Keva.getRepo("artist_new_release_highlight_repo").storeInt(C246349le.LIZJ("artist_music_offline_show_times"), Keva.getRepo("artist_new_release_highlight_repo").getInt(C246349le.LIZJ("artist_music_offline_show_times"), 0) + 1);
                Keva.getRepo("artist_new_release_highlight_repo").storeLong(C246349le.LIZJ("artist_music_offline_last_show_timestamp"), System.currentTimeMillis());
                this.LJLILLLLZI.getClass();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("page", "music_tab");
                FMX.LJIIL("aop_authorize_notice_show", c188727au.LIZ);
            }
        }
        return C76800UCe.LIZ;
    }
}
