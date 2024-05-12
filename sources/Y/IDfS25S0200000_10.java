package Y;

import X.AbstractC58752N4a;
import X.C162476Zf;
import X.C16880lQ;
import X.C32I;
import X.C57148Mbo;
import X.C58753N4b;
import X.C58754N4c;
import X.C58755N4d;
import X.C58756N4e;
import X.C58757N4f;
import X.C58878N8w;
import X.C58879N8x;
import X.C59027NEp;
import X.C63797P2b;
import X.C63799P2d;
import X.C72972SkS;
import X.C76800UCe;
import X.C78939UyV;
import X.C79057V0z;
import X.EnumC58046MqI;
import X.EnumC77147UPn;
import X.H96;
import X.InterfaceC64672gJ;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.N4T;
import X.N4Z;
import X.N5K;
import X.N6F;
import X.N8M;
import X.NFB;
import X.NFK;
import X.NFN;
import X.NFP;
import X.OJD;
import X.V0N;
import X.W5F;
import X.W5U;
import X.X1D;
import X.XLM;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1.CommerceMusicSubstituteMusicVideoFragment;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.viewmodel.RecommendMusicV2ViewModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDfS25S0200000_10 implements InterfaceC64672gJ {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64672gJ
    public final Object emit(String str, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return emit$0(this, str, interfaceC67352kd);
            case 1:
                return emit$1(this, str, interfaceC67352kd);
            case 2:
                return emit$2(this, str, interfaceC67352kd);
            case 3:
                return emit$3(this, str, interfaceC67352kd);
            case 4:
                return emit$4(this, str, interfaceC67352kd);
            case 5:
                return emit$5(this, str, interfaceC67352kd);
            case 6:
                return emit$6(this, str, interfaceC67352kd);
            case 7:
                return emit$7(this, str, interfaceC67352kd);
            case 8:
                return emit$8(this, str, interfaceC67352kd);
            case 9:
                return emit$9(this, str, interfaceC67352kd);
            case 10:
                return emit$10(this, str, interfaceC67352kd);
            default:
                return null;
        }
    }

    public IDfS25S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object emit$0(IDfS25S0200000_10 iDfS25S0200000_10, Object obj, InterfaceC67352kd interfaceC67352kd) {
        TextView textView = (TextView) iDfS25S0200000_10.l0;
        String string = ((CommerceMusicSubstituteMusicVideoFragment) iDfS25S0200000_10.l1).requireContext().getString(R.string.igh);
        o.LJIIIIZZ(string, "this@CommerceMusicSubsti…ail_cml_page_description)");
        textView.setText(ujb.o.LJJJJZ(string, "{sound_name}", (String) obj, false));
        return C76800UCe.LIZ;
    }

    public static final Object emit$1(IDfS25S0200000_10 iDfS25S0200000_10, Object obj, InterfaceC67352kd interfaceC67352kd) {
        EnumC58046MqI enumC58046MqI;
        C57148Mbo c57148Mbo = (C57148Mbo) obj;
        if (C63799P2d.LIZ[c57148Mbo.LIZ.LJLILLLLZI.ordinal()] == 1 && c57148Mbo.LIZ.LJLIL.LJLJI) {
            FindFriendsPageVM findFriendsPageVM = (FindFriendsPageVM) iDfS25S0200000_10.l0;
            EnumC77147UPn enumC77147UPn = (EnumC77147UPn) iDfS25S0200000_10.l1;
            findFriendsPageVM.getClass();
            int i = C63797P2b.LIZIZ[enumC77147UPn.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("unknown platform: ");
                        LIZ.append(enumC77147UPn);
                        String LIZIZ = X1D.LIZIZ(LIZ);
                        LIZIZ.toString();
                        throw new IllegalStateException(LIZIZ);
                    }
                } else {
                    enumC58046MqI = EnumC58046MqI.CONTACT;
                }
            } else {
                enumC58046MqI = EnumC58046MqI.FACEBOOK;
            }
            if (enumC58046MqI != null) {
                ((FindFriendsPageVM) iDfS25S0200000_10.l0).uh0(enumC58046MqI, "auto");
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$10(IDfS25S0200000_10 iDfS25S0200000_10, Object obj, InterfaceC67352kd interfaceC67352kd) {
        NFB nfb;
        Context context;
        if (((Boolean) obj).booleanValue() && (context = (nfb = (NFB) iDfS25S0200000_10.l0).LJLJJLL) != null) {
            NFN nfn = (NFN) nfb.LLD.getValue();
            ((NFB) iDfS25S0200000_10.l0).getClass();
            nfn.LIZIZ(NFP.LIZ(), context, C79057V0z.LJIIIIZZ(C59027NEp.LIZ().LIZ(C79057V0z.LJIJJ(((NFB) iDfS25S0200000_10.l0).LJLJL)), "followup2", ((NFB) iDfS25S0200000_10.l0).LJLJL), new AqS160S0100000_10((AdFollowUpAceSurveyVM) iDfS25S0200000_10.l1, 628));
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$2(IDfS25S0200000_10 iDfS25S0200000_10, Object obj, InterfaceC67352kd interfaceC67352kd) {
        TextView textView = (TextView) iDfS25S0200000_10.l0;
        String string = ((N5K) iDfS25S0200000_10.l1).LJLIL.getContext().getString(R.string.igh);
        o.LJIIIIZZ(string, "container.context.getStr…ail_cml_page_description)");
        textView.setText(ujb.o.LJJJJZ(string, "{sound_name}", (String) obj, false));
        return C76800UCe.LIZ;
    }

    public static final Object emit$3(IDfS25S0200000_10 iDfS25S0200000_10, Object obj, InterfaceC67352kd interfaceC67352kd) {
        int intValue;
        TextUtils.TruncateAt truncateAt;
        boolean z;
        int i;
        int i2;
        int i3;
        NFK nfk = (NFK) obj;
        TuxTextView tuxTextView = ((C58878N8w) iDfS25S0200000_10.l0).LJLJJLL;
        tuxTextView.setText(nfk.LIZ);
        N4Z n4z = nfk.LJI;
        int[] iArr = C58756N4e.LIZ;
        int i4 = iArr[n4z.ordinal()];
        int i5 = 0;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    Integer LIZJ = C72972SkS.LIZJ(tuxTextView, "context", R.attr.go);
                    if (LIZJ != null) {
                        intValue = LIZJ.intValue();
                    }
                    intValue = 0;
                } else {
                    throw new C162476Zf();
                }
            } else {
                Integer LIZJ2 = C72972SkS.LIZJ(tuxTextView, "context", R.attr.eb);
                if (LIZJ2 != null) {
                    intValue = LIZJ2.intValue();
                }
                intValue = 0;
            }
        } else {
            Integer LIZJ3 = C72972SkS.LIZJ(tuxTextView, "context", R.attr.eb);
            if (LIZJ3 != null) {
                intValue = LIZJ3.intValue();
            }
            intValue = 0;
        }
        tuxTextView.setTextColor(intValue);
        if (iArr[nfk.LJI.ordinal()] == 1) {
            truncateAt = TextUtils.TruncateAt.MARQUEE;
        } else {
            truncateAt = TextUtils.TruncateAt.END;
        }
        tuxTextView.setEllipsize(truncateAt);
        if (nfk.LJI != N4Z.PAUSED) {
            z = true;
        } else {
            z = false;
        }
        tuxTextView.setSelected(z);
        ((C58878N8w) iDfS25S0200000_10.l0).LJLJL.setText(nfk.LIZIZ);
        ((C58878N8w) iDfS25S0200000_10.l0).LJLJLJ.setText(nfk.LIZ());
        View view = ((C58878N8w) iDfS25S0200000_10.l0).LJLLJ;
        if (nfk.LIZLLL > 0) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        TuxTextView tuxTextView2 = ((C58878N8w) iDfS25S0200000_10.l0).LJLJLLL;
        if (nfk.LIZLLL > 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextView2.setVisibility(i2);
        C58878N8w c58878N8w = (C58878N8w) iDfS25S0200000_10.l0;
        TuxTextView tuxTextView3 = c58878N8w.LJLJLLL;
        CharSequence quantityText = c58878N8w.LJLIL.getContext().getResources().getQuantityText(R.plurals.bh, nfk.LIZLLL);
        o.LJIIIIZZ(quantityText, "container.context.resour…nt,\n                    )");
        tuxTextView3.setText(new OJD("\\[num]").replaceFirst(quantityText, nfk.LIZIZ()));
        TuxTag tuxTag = ((C58878N8w) iDfS25S0200000_10.l0).LJLL;
        if (tuxTag != null) {
            if (TextUtils.isEmpty(nfk.LJ)) {
                i5 = 8;
            }
            tuxTag.setVisibility(i5);
        }
        TuxTag tuxTag2 = ((C58878N8w) iDfS25S0200000_10.l0).LJLL;
        if (tuxTag2 != null) {
            tuxTag2.setText(nfk.LJ);
        }
        C58878N8w c58878N8w2 = (C58878N8w) iDfS25S0200000_10.l0;
        C16880lQ.LJJIZ(c58878N8w2.LJLLI, new ACListenerS45S0200000_10((CommerceMusicSubstituteMusicListViewModel) iDfS25S0200000_10.l1, c58878N8w2, 24));
        C58878N8w c58878N8w3 = (C58878N8w) iDfS25S0200000_10.l0;
        C16880lQ.LJJJ(c58878N8w3.LJLLILLLL, new ACListenerS45S0200000_10((CommerceMusicSubstituteMusicListViewModel) iDfS25S0200000_10.l1, c58878N8w3, 25));
        C58878N8w c58878N8w4 = (C58878N8w) iDfS25S0200000_10.l0;
        C16880lQ.LJJIJLIJ(c58878N8w4.LJLJJL, new ACListenerS45S0200000_10((CommerceMusicSubstituteMusicListViewModel) iDfS25S0200000_10.l1, c58878N8w4, 26));
        C58878N8w c58878N8w5 = (C58878N8w) iDfS25S0200000_10.l0;
        C16880lQ.LJIIJ(new ACListenerS45S0200000_10((CommerceMusicSubstituteMusicListViewModel) iDfS25S0200000_10.l1, c58878N8w5, 27), c58878N8w5.LJLIL);
        TuxIconView tuxIconView = ((C58878N8w) iDfS25S0200000_10.l0).LJLLILLLL;
        int i6 = iArr[nfk.LJI.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    i3 = R.drawable.b2p;
                } else {
                    throw new C162476Zf();
                }
            } else {
                i3 = R.raw.icon_spinner_normal;
            }
        } else {
            i3 = R.drawable.b2a;
        }
        tuxIconView.setIconRes(i3);
        if (iArr[nfk.LJI.ordinal()] == 2) {
            C58878N8w c58878N8w6 = (C58878N8w) iDfS25S0200000_10.l0;
            c58878N8w6.LJLLILLLL.startAnimation(c58878N8w6.LJLLLL);
        } else {
            ((C58878N8w) iDfS25S0200000_10.l0).LJLLILLLL.clearAnimation();
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$4(IDfS25S0200000_10 iDfS25S0200000_10, Object obj, InterfaceC67352kd interfaceC67352kd) {
        TextView textView = (TextView) iDfS25S0200000_10.l0;
        String string = ((ViewStub) iDfS25S0200000_10.l1).getContext().getString(R.string.c2s);
        o.LJIIIIZZ(string, "stub.context.getString(R…ic_detail_page_rec_intro)");
        textView.setText(ujb.o.LJJJJZ(string, "{sound_name}", (String) obj, false));
        return C76800UCe.LIZ;
    }

    public static final Object emit$5(IDfS25S0200000_10 iDfS25S0200000_10, Object obj, InterfaceC67352kd interfaceC67352kd) {
        int i;
        int i2;
        int i3;
        TextUtils.TruncateAt truncateAt;
        NFK nfk = (NFK) obj;
        ((C58879N8x) iDfS25S0200000_10.l0).LJLJJI.setText(nfk.LIZ);
        ((C58879N8x) iDfS25S0200000_10.l0).LJLJJL.setText(nfk.LIZIZ);
        ((C58879N8x) iDfS25S0200000_10.l0).LJLJJLL.setText(nfk.LIZ());
        View view = ((C58879N8x) iDfS25S0200000_10.l0).LJLLI;
        int i4 = 8;
        boolean z = false;
        if (nfk.LIZLLL > 0) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        TuxTextView tuxTextView = ((C58879N8x) iDfS25S0200000_10.l0).LJLJL;
        if (nfk.LIZLLL > 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextView.setVisibility(i2);
        C58879N8x c58879N8x = (C58879N8x) iDfS25S0200000_10.l0;
        TuxTextView tuxTextView2 = c58879N8x.LJLJL;
        CharSequence quantityText = c58879N8x.LJLIL.getContext().getResources().getQuantityText(R.plurals.bh, nfk.LIZLLL);
        o.LJIIIIZZ(quantityText, "container.context.resour…nt,\n                    )");
        tuxTextView2.setText(new OJD("\\[num]").replaceFirst(quantityText, nfk.LIZIZ()));
        TuxTag tuxTag = ((C58879N8x) iDfS25S0200000_10.l0).LJLJLJ;
        if (!TextUtils.isEmpty(nfk.LJ)) {
            i4 = 0;
        }
        tuxTag.setVisibility(i4);
        ((C58879N8x) iDfS25S0200000_10.l0).LJLJLJ.setText(nfk.LJ);
        C58879N8x c58879N8x2 = (C58879N8x) iDfS25S0200000_10.l0;
        C16880lQ.LJJIZ(c58879N8x2.LJLJLLL, new ACListenerS45S0200000_10((RecommendMusicV2ViewModel) iDfS25S0200000_10.l1, c58879N8x2, 37));
        C58879N8x c58879N8x3 = (C58879N8x) iDfS25S0200000_10.l0;
        C16880lQ.LJJJ(c58879N8x3.LJLL, new ACListenerS45S0200000_10((RecommendMusicV2ViewModel) iDfS25S0200000_10.l1, c58879N8x3, 38));
        C58879N8x c58879N8x4 = (C58879N8x) iDfS25S0200000_10.l0;
        C16880lQ.LJJIJLIJ(c58879N8x4.LJLJI, new ACListenerS45S0200000_10((RecommendMusicV2ViewModel) iDfS25S0200000_10.l1, c58879N8x4, 39));
        C58879N8x c58879N8x5 = (C58879N8x) iDfS25S0200000_10.l0;
        C16880lQ.LJIIJ(new ACListenerS45S0200000_10((RecommendMusicV2ViewModel) iDfS25S0200000_10.l1, c58879N8x5, 40), c58879N8x5.LJLIL);
        TuxIconView tuxIconView = ((C58879N8x) iDfS25S0200000_10.l0).LJLL;
        N4Z n4z = nfk.LJI;
        int[] iArr = C58757N4f.LIZ;
        int i5 = iArr[n4z.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    i3 = R.drawable.b2p;
                } else {
                    throw new C162476Zf();
                }
            } else {
                i3 = R.raw.icon_spinner_normal;
            }
        } else {
            i3 = R.drawable.b2a;
        }
        tuxIconView.setIconRes(i3);
        if (iArr[nfk.LJI.ordinal()] == 2) {
            C58879N8x c58879N8x6 = (C58879N8x) iDfS25S0200000_10.l0;
            c58879N8x6.LJLL.startAnimation(c58879N8x6.LJLLJ);
        } else {
            ((C58879N8x) iDfS25S0200000_10.l0).LJLL.clearAnimation();
        }
        TuxTextView tuxTextView3 = ((C58879N8x) iDfS25S0200000_10.l0).LJLJJI;
        if (iArr[nfk.LJI.ordinal()] == 1) {
            truncateAt = TextUtils.TruncateAt.MARQUEE;
        } else {
            truncateAt = TextUtils.TruncateAt.END;
        }
        tuxTextView3.setEllipsize(truncateAt);
        TuxTextView tuxTextView4 = ((C58879N8x) iDfS25S0200000_10.l0).LJLJJI;
        if (nfk.LJI == N4Z.PLAYING) {
            z = true;
        }
        tuxTextView4.setSelected(z);
        return C76800UCe.LIZ;
    }

    public static final Object emit$6(IDfS25S0200000_10 iDfS25S0200000_10, Object obj, InterfaceC67352kd interfaceC67352kd) {
        N4Z n4z;
        AbstractC58752N4a abstractC58752N4a = (AbstractC58752N4a) obj;
        XLM xlm = ((RecommendMusicV2ViewModel) iDfS25S0200000_10.l0).LJLJJL;
        List<Music> list = ((MusicDetail) iDfS25S0200000_10.l1).recommendMusicList;
        o.LJI(list);
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (Music music : list) {
            String musicName = music.getMusicName();
            o.LJIIIIZZ(musicName, "music.musicName");
            String authorName = music.getAuthorName();
            o.LJIIIIZZ(authorName, "music.authorName");
            int duration = music.getDuration();
            int userCount = music.getUserCount();
            String recommendTag = music.getRecommendTag();
            UrlModel coverMedium = music.getCoverMedium();
            o.LJIIIIZZ(coverMedium, "music.coverMedium");
            String LJIILL = V0N.LJIILL(coverMedium);
            if (LJIILL == null) {
                UrlModel coverLarge = music.getCoverLarge();
                o.LJIIIIZZ(coverLarge, "music.coverLarge");
                LJIILL = V0N.LJIILL(coverLarge);
                if (LJIILL == null) {
                    UrlModel coverThumb = music.getCoverThumb();
                    o.LJIIIIZZ(coverThumb, "music.coverThumb");
                    LJIILL = V0N.LJIILL(coverThumb);
                }
            }
            if (abstractC58752N4a instanceof C58755N4d) {
                if (music.getId() == ((C58755N4d) abstractC58752N4a).LIZ.getId()) {
                    n4z = N4Z.PLAYING;
                } else {
                    n4z = N4Z.PAUSED;
                }
            } else if (abstractC58752N4a instanceof C58753N4b) {
                if (music.getId() == ((C58753N4b) abstractC58752N4a).LIZ.getId()) {
                    n4z = N4Z.LOADING;
                } else {
                    n4z = N4Z.PAUSED;
                }
            } else if (abstractC58752N4a instanceof C58754N4c) {
                n4z = N4Z.PAUSED;
            } else {
                throw new C162476Zf();
            }
            arrayList.add(new NFK(musicName, authorName, duration, userCount, recommendTag, LJIILL, n4z));
        }
        Music music2 = ((MusicDetail) iDfS25S0200000_10.l1).music;
        o.LJI(music2);
        String musicName2 = music2.getMusicName();
        o.LJIIIIZZ(musicName2, "musicDetail.music!!.musicName");
        xlm.setValue(new N4T(musicName2, arrayList, true));
        if (abstractC58752N4a instanceof C58755N4d) {
            H96 h96 = new H96();
            MusicModel musicModel = ((C58755N4d) abstractC58752N4a).LIZ;
            if (musicModel != null) {
                h96.LJIIIIZZ(musicModel);
                h96.LJII("ttelite_BA_music_rec_select_play", "meta_song_id");
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$7(IDfS25S0200000_10 iDfS25S0200000_10, Object obj, InterfaceC67352kd interfaceC67352kd) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("subscribe State : ");
        LIZ.append(((N6F) iDfS25S0200000_10.l0).name());
        LIZ.append(" it=");
        LIZ.append(obj);
        N8M.LIZ(X1D.LIZIZ(LIZ));
        ((InterfaceC65784Pro) iDfS25S0200000_10.l1).invoke();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$8(Y.IDfS25S0200000_10 r5, java.lang.Object r6, X.InterfaceC67352kd r7) {
        /*
            boolean r0 = r7 instanceof X.C59012NEa
            if (r0 == 0) goto L39
            r4 = r7
            X.NEa r4 = (X.C59012NEa) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L3f
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r1 = r5.l0
            X.2gJ r1 = (X.InterfaceC64672gJ) r1
            java.lang.Object r0 = r5.l1
            X.N6F r0 = (X.N6F) r0
            if (r6 != r0) goto L20
            r4.LJLILLLLZI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L20
            return r3
        L39:
            X.NEa r4 = new X.NEa
            r4.<init>(r5, r7)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS25S0200000_10.emit$8(Y.IDfS25S0200000_10, java.lang.Object, X.2kd):java.lang.Object");
    }

    public static final Object emit$9(IDfS25S0200000_10 iDfS25S0200000_10, Object obj, InterfaceC67352kd interfaceC67352kd) {
        UrlModel urlModel = (UrlModel) obj;
        SmartImageView smartImageView = ((NFB) iDfS25S0200000_10.l0).LJLLI;
        if (smartImageView != null) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
            LJII.LIZJ = ((NFB) iDfS25S0200000_10.l0).LJLJJLL;
            LJII.LIZIZ("AdFollowUpAceSurveyView");
            LJII.LJJIIJ = smartImageView;
            LJII.LIZLLL(null);
            C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS30S0100000_10((AdFollowUpAceSurveyVM) iDfS25S0200000_10.l1, 220));
        }
        return C76800UCe.LIZ;
    }
}
