package kotlin.jvm.internal;

import X.ALS;
import X.AR4;
import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C188727au;
import X.C239849bA;
import X.C243889hg;
import X.C26224AQy;
import X.C5S1;
import X.C76800UCe;
import X.C7GV;
import X.C85990Xow;
import X.DialogC25754A8w;
import X.FMX;
import X.HG3;
import X.InterfaceC57784Mm4;
import X.InterfaceC88472Yns;
import X.InterfaceC88474Ynu;
import X.KL2;
import X.RBX;
import X.SY4;
import X.ViewOnClickListenerC252769w0;
import Y.ACListenerS26S1200000_4;
import Y.ARunnableS10S0110000_4;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.sheet.intro.TuxIntroFragment;
import com.ss.android.ugc.aweme.feed.assem.statecontrol.StateControlMediaAssem;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog;
import com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicFeaturedVideoViewModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.assem.SeriesDraftBottomContainerAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class IDqS451S0100000_4 extends AbstractC65781Prl implements InterfaceC88474Ynu {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88474Ynu
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            case 6:
                return invoke$6(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS451S0100000_4(View view, int i) {
        super(4);
        this.$t = i;
        this.l0 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS451S0100000_4(TuxIntroFragment tuxIntroFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = tuxIntroFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS451S0100000_4(NotificationLiveBottomDialog notificationLiveBottomDialog, int i) {
        super(4);
        this.$t = i;
        this.l0 = notificationLiveBottomDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS451S0100000_4(ArtistMusicFeaturedVideoViewModel artistMusicFeaturedVideoViewModel, int i) {
        super(4);
        this.$t = i;
        this.l0 = artistMusicFeaturedVideoViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS451S0100000_4(SeriesDraftBottomContainerAssem seriesDraftBottomContainerAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = seriesDraftBottomContainerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS451S0100000_4(BaseMyProfileGuideWidget baseMyProfileGuideWidget, int i) {
        super(4);
        this.$t = i;
        this.l0 = baseMyProfileGuideWidget;
    }

    public final void invoke$0(StateControlMediaAssem selectSubscribe, boolean z, String str, String str2) {
        int i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) selectSubscribe.LLFII.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.zn("left_container_scm", selectSubscribe, z);
        }
        selectSubscribe.getContainerView().post(new ARunnableS10S0110000_4(selectSubscribe, z, 2));
        SY4 sy4 = (SY4) ((View) this.l0).findViewById(R.id.jbv);
        sy4.setMaxWidth((int) KL2.LIZJ(sy4.getContext(), 300.0f));
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        sy4.setVisibility(i);
        sy4.setButtonStartIcon(Integer.valueOf(R.raw.icon_info_circle_fill));
        sy4.setText(str);
        C16880lQ.LJJIZ(sy4, new ACListenerS26S1200000_4(sy4, selectSubscribe, str2, 1));
        C7GV.LIZ(2, (View) this.l0);
        if (z) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("country_code", C85990Xow.LIZ());
            c188727au.LJIIIZ("page_name", selectSubscribe.getEnterFrom());
            c188727au.LJIIIZ("object_id", ((RBX) HG3.LJIILL()).getCurUserId());
            FMX.LJIIL("scm_page_view", c188727au.LIZ);
        }
    }

    public static final Object invoke$0(IDqS451S0100000_4 iDqS451S0100000_4, Object obj, Object obj2, Object obj3, Object obj4) {
        CharSequence charSequence = (CharSequence) obj;
        InterfaceC88472Yns<? super AR4, C76800UCe> interfaceC88472Yns = (InterfaceC88472Yns) obj2;
        CharSequence charSequence2 = (CharSequence) obj3;
        InterfaceC88472Yns<? super AR4, C76800UCe> interfaceC88472Yns2 = (InterfaceC88472Yns) obj4;
        LinearLayout linearLayout = ((TuxIntroFragment) iDqS451S0100000_4.l0).LJLLLL;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        TuxIntroFragment tuxIntroFragment = (TuxIntroFragment) iDqS451S0100000_4.l0;
        C26224AQy c26224AQy = tuxIntroFragment.LJLIL;
        if (c26224AQy != null) {
            c26224AQy.LJII = charSequence;
            c26224AQy.LJIIIZ = interfaceC88472Yns;
            c26224AQy.LJIIIIZZ = charSequence2;
            c26224AQy.LJIIJ = interfaceC88472Yns2;
            tuxIntroFragment.vl(tuxIntroFragment.LJLLLL, c26224AQy);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(IDqS451S0100000_4 iDqS451S0100000_4, Object obj, Object obj2, Object obj3, Object obj4) {
        iDqS451S0100000_4.invoke$0((StateControlMediaAssem) obj, ((Boolean) obj2).booleanValue(), (String) obj3, (String) obj4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS451S0100000_4 iDqS451S0100000_4, Object obj, Object obj2, Object obj3, Object obj4) {
        String selectedAwemeId = (String) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        o.LJIIIZ(selectedAwemeId, "selectedAwemeId");
        o.LJIIIZ(obj4, "<anonymous parameter 3>");
        if (booleanValue) {
            ((ArtistMusicFeaturedVideoViewModel) iDqS451S0100000_4.l0).setState(C239849bA.LJLIL);
        } else {
            if (booleanValue2) {
                ArtistMusicFeaturedVideoViewModel artistMusicFeaturedVideoViewModel = (ArtistMusicFeaturedVideoViewModel) iDqS451S0100000_4.l0;
                artistMusicFeaturedVideoViewModel.getClass();
                artistMusicFeaturedVideoViewModel.setState(new AqS29S1000000_4("", 23));
                artistMusicFeaturedVideoViewModel.LJLJI = "";
            } else {
                ArtistMusicFeaturedVideoViewModel artistMusicFeaturedVideoViewModel2 = (ArtistMusicFeaturedVideoViewModel) iDqS451S0100000_4.l0;
                artistMusicFeaturedVideoViewModel2.getClass();
                artistMusicFeaturedVideoViewModel2.setState(new AqS29S1000000_4(selectedAwemeId, 23));
                artistMusicFeaturedVideoViewModel2.LJLJI = selectedAwemeId;
            }
            Iterator<InterfaceC57784Mm4> it = ((ArtistMusicFeaturedVideoViewModel) iDqS451S0100000_4.l0).LJLJJI.iterator();
            while (it.hasNext()) {
                InterfaceC57784Mm4 next = it.next();
                if (next instanceof C243889hg) {
                    C243889hg c243889hg = (C243889hg) next;
                    if (!o.LJ(c243889hg.LJLIL, ((ArtistMusicFeaturedVideoViewModel) iDqS451S0100000_4.l0).LJLJI) && c243889hg.LJLJJL) {
                        C243889hg LIZ = C243889hg.LIZ(c243889hg, false);
                        ((ArtistMusicFeaturedVideoViewModel) iDqS451S0100000_4.l0).listSetItem((ArtistMusicFeaturedVideoViewModel) LIZ);
                        ListProtector.set(((ArtistMusicFeaturedVideoViewModel) iDqS451S0100000_4.l0).LJLJJI, ((ArtistMusicFeaturedVideoViewModel) iDqS451S0100000_4.l0).LJLJJI.indexOf(next), LIZ);
                    }
                    if (o.LJ(c243889hg.LJLIL, ((ArtistMusicFeaturedVideoViewModel) iDqS451S0100000_4.l0).LJLJI) && !c243889hg.LJLJJL) {
                        C243889hg LIZ2 = C243889hg.LIZ(c243889hg, true);
                        ((ArtistMusicFeaturedVideoViewModel) iDqS451S0100000_4.l0).listSetItem((ArtistMusicFeaturedVideoViewModel) LIZ2);
                        ListProtector.set(((ArtistMusicFeaturedVideoViewModel) iDqS451S0100000_4.l0).LJLJJI, ((ArtistMusicFeaturedVideoViewModel) iDqS451S0100000_4.l0).LJLJJI.indexOf(next), LIZ2);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS451S0100000_4 iDqS451S0100000_4, Object selectSubscribe, Object obj, Object obj2, Object obj3) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        SeriesDraftBottomContainerAssem seriesDraftBottomContainerAssem = (SeriesDraftBottomContainerAssem) iDqS451S0100000_4.l0;
        SY4 sy4 = seriesDraftBottomContainerAssem.LJLL;
        if (sy4 != null) {
            sy4.setEnabled(seriesDraftBottomContainerAssem.H3().iv0());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS451S0100000_4 iDqS451S0100000_4, Object selectSubscribe, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        SeriesDraftBottomContainerAssem seriesDraftBottomContainerAssem = (SeriesDraftBottomContainerAssem) iDqS451S0100000_4.l0;
        SY4 sy4 = seriesDraftBottomContainerAssem.LJLL;
        if (sy4 != null) {
            sy4.setEnabled(seriesDraftBottomContainerAssem.H3().iv0());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS451S0100000_4 iDqS451S0100000_4, Object selectSubscribe, Object obj, Object obj2, Object obj3) {
        ViewOnClickListenerC252769w0 LJFF;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!booleanValue && o.LJ(obj2, Boolean.TRUE) && !booleanValue2 && (((LJFF = ((BaseMyProfileGuideWidget) iDqS451S0100000_4.l0).LJFF()) == null || LJFF.getVisibility() != 0) && !PopupManager.LJFF())) {
            ((BaseMyProfileGuideWidget) iDqS451S0100000_4.l0).getClass();
            if (AVExternalServiceImpl.LIZ().publishService().getSurveyAfterPostService().shouldShowAuthorSurveyInProfile()) {
                ((BaseMyProfileGuideWidget) iDqS451S0100000_4.l0).LJIILJJIL();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS451S0100000_4 iDqS451S0100000_4, Object selectSubscribe, Object obj, Object obj2, Object obj3) {
        String str;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (obj != null) {
            NotificationLiveBottomDialog notificationLiveBottomDialog = (NotificationLiveBottomDialog) iDqS451S0100000_4.l0;
            DialogC25754A8w dialogC25754A8w = notificationLiveBottomDialog.LJLLILLLL;
            if (dialogC25754A8w != null) {
                dialogC25754A8w.dismiss();
            }
            if (intValue2 == 0) {
                notificationLiveBottomDialog.vl(intValue);
                AwemeRawAd awemeRawAd = notificationLiveBottomDialog.LJLJLJ;
                if (awemeRawAd == null || awemeRawAd.getNotificationConfig() != 1) {
                    notificationLiveBottomDialog.dismiss();
                }
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue == 3) {
                            C5S1 c5s1 = new C5S1(notificationLiveBottomDialog.getContext());
                            c5s1.LIZJ(R.string.mjx);
                            c5s1.LJ();
                        }
                    } else {
                        C5S1 c5s12 = new C5S1(notificationLiveBottomDialog.getContext());
                        c5s12.LIZJ(R.string.mk4);
                        c5s12.LJ();
                    }
                } else {
                    Context context = notificationLiveBottomDialog.getContext();
                    String str2 = null;
                    if (context != null) {
                        str = context.getString(R.string.mjt);
                    } else {
                        str = null;
                    }
                    User user = notificationLiveBottomDialog.LJLIL;
                    if (user != null) {
                        str2 = user.getNickname();
                    }
                    if (str != null && str2 != null) {
                        C5S1 c5s13 = new C5S1(notificationLiveBottomDialog.getContext());
                        String LLLZ = C16880lQ.LLLZ(str, Arrays.copyOf(new Object[]{str2}, 1));
                        o.LJIIIIZZ(LLLZ, "format(format, *args)");
                        c5s13.LIZLLL(LLLZ);
                        c5s13.LJ();
                    }
                }
                ALS als = notificationLiveBottomDialog.LJLL;
                if (als != null) {
                    als.LIZJ(intValue);
                }
            } else {
                notificationLiveBottomDialog.xl();
            }
        }
        return C76800UCe.LIZ;
    }
}
