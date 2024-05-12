package X;

import Y.ARunnableS15S0110000_9;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CCTemplateInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MGU implements InterfaceC223218pR<Aweme> {
    public final int LJLIL;
    public final /* synthetic */ DetailAwemeListFragment LJLILLLLZI;

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<Aweme> list, boolean z) {
    }

    public final KUR LIZ() {
        if (!this.LJLILLLLZI.isViewValid()) {
            return null;
        }
        DetailAwemeListFragment detailAwemeListFragment = this.LJLILLLLZI;
        if (detailAwemeListFragment.LJZL == null) {
            return detailAwemeListFragment.LJZI;
        }
        return detailAwemeListFragment.LLIL.get(this.LJLIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0.isCanNotReuse() == true) goto L13;
     */
    @Override // X.InterfaceC223218pR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ne() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGU.Ne():void");
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        C56492MFc c56492MFc = this.LJLILLLLZI.LLIILII.get(this.LJLIL);
        if (c56492MFc != null) {
            if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
                try {
                    c56492MFc.showFooter();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            c56492MFc.showLoadMoreLoading();
        }
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
        KUR LIZ = LIZ();
        if (LIZ != null && LIZ.getVisibility() == 0 && !C227768wm.LJJI(this.LJLILLLLZI.Jl()) && !TextUtils.equals("question", this.LJLILLLLZI.Jl()) && !TextUtils.equals("library_detail_page", this.LJLILLLLZI.Jl())) {
            LIZ.LJIIIZ();
        }
    }

    public MGU(DetailAwemeListFragment detailAwemeListFragment) {
        this.LJLILLLLZI = detailAwemeListFragment;
        this.LJLIL = detailAwemeListFragment.LJLILLLLZI;
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        if (!this.LJLILLLLZI.isViewValid()) {
            return;
        }
        this.LJLILLLLZI.Ol();
        KUR LIZ = LIZ();
        if (LIZ != null) {
            T t = this.LJLILLLLZI.LJLJJL.LJLIL;
            if (!(t instanceof AbstractC51036K1g) || C79004UzY.LJJIFFI(((AbstractC51036K1g) t).getItems())) {
                LIZ.LJIIIIZZ();
            }
        }
        this.LJLILLLLZI.LLIILII.get(this.LJLIL);
        if (this.LJLILLLLZI.Al()) {
            J5(new ArrayList(), false);
        }
        DetailAwemeListFragment detailAwemeListFragment = this.LJLILLLLZI;
        InterfaceC56522MGg interfaceC56522MGg = detailAwemeListFragment.LLFII;
        if (interfaceC56522MGg != null && detailAwemeListFragment.LJLILLLLZI == this.LJLIL) {
            interfaceC56522MGg.LIZ(detailAwemeListFragment.lh());
        }
        V18 v18 = this.LJLILLLLZI.LLFZ;
        if (v18 != null && exc != null) {
            v18.LJFF(exc);
        }
        this.LJLILLLLZI.LLIILZL.put(this.LJLIL, false);
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        C56492MFc c56492MFc = this.LJLILLLLZI.LLIILII.get(this.LJLIL);
        if (c56492MFc != null) {
            if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
                C25678A5y.LIZ(this.LJLILLLLZI.mo49getActivity(), "", exc, null);
                T9K t9k = this.LJLILLLLZI.LJLZ;
                if (t9k != null) {
                    t9k.LIZ(exc);
                }
            } else {
                c56492MFc.showLoadMoreError();
            }
        }
        V18 v18 = this.LJLILLLLZI.LLFZ;
        if (v18 != null && exc != null) {
            v18.LJFF(exc);
        }
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<Aweme> list, boolean z) {
        MFQ mfq;
        CCTemplateInfo ccTemplateInfo;
        String str;
        String str2;
        String str3;
        Object obj;
        String str4;
        String template_music_id;
        String idStr;
        if (!this.LJLILLLLZI.isViewValid()) {
            return;
        }
        this.LJLILLLLZI.Ol();
        C56492MFc c56492MFc = this.LJLILLLLZI.LLIILII.get(this.LJLIL);
        KUR LIZ = LIZ();
        if (c56492MFc != null) {
            c56492MFc.resetLoadMoreState();
            List<Aweme> Hl = this.LJLILLLLZI.Hl(list);
            c56492MFc.setData(this.LJLILLLLZI.Ml(Hl));
            DetailAwemeListFragment detailAwemeListFragment = this.LJLILLLLZI;
            String str5 = detailAwemeListFragment.LJLJJLL;
            Context context = detailAwemeListFragment.getContext();
            String str6 = this.LJLILLLLZI.LJLJL;
            if (context != null) {
                ArrayList arrayList = (ArrayList) Hl;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i >= 0) {
                            Aweme aweme = (Aweme) next;
                            if ((C224868s6.LIZLLL(aweme) || C224868s6.LIZJ(aweme)) && (ccTemplateInfo = aweme.getCcTemplateInfo()) != null) {
                                ccTemplateInfo.setTemplateOrder(i2);
                                String str7 = "";
                                if (str6 == null) {
                                    str = "";
                                } else {
                                    str = str6;
                                }
                                if (str5 == null) {
                                    str2 = "";
                                } else {
                                    str2 = str5;
                                }
                                C188727au c188727au = new C188727au();
                                c188727au.LJIIIZ("group_id", str);
                                CCTemplateInfo ccTemplateInfo2 = aweme.getCcTemplateInfo();
                                if (ccTemplateInfo2 == null || (str3 = ccTemplateInfo2.getTemplate_id()) == null) {
                                    str3 = "";
                                }
                                c188727au.LJIIIZ("template_id", str3);
                                c188727au.LIZLLL(C224868s6.LIZIZ(context) ? 1 : 0, "is_install_lv");
                                c188727au.LJIIIZ("enter_from", str2);
                                CCTemplateInfo ccTemplateInfo3 = aweme.getCcTemplateInfo();
                                if (ccTemplateInfo3 != null) {
                                    obj = Integer.valueOf(ccTemplateInfo3.getTemplateOrder());
                                } else {
                                    obj = null;
                                }
                                c188727au.LJFF(obj, "order");
                                CCTemplateInfo ccTemplateInfo4 = aweme.getCcTemplateInfo();
                                if (ccTemplateInfo4 != null) {
                                    str4 = ccTemplateInfo4.getMatch_type();
                                } else {
                                    str4 = null;
                                }
                                c188727au.LJIIIZ("match_type", str4);
                                if (C224868s6.LIZJ(aweme)) {
                                    Music music = aweme.getMusic();
                                    if (music != null && (idStr = music.getIdStr()) != null) {
                                        str7 = idStr;
                                    }
                                    c188727au.LJI("music_id", str7);
                                } else {
                                    CCTemplateInfo ccTemplateInfo5 = aweme.getCcTemplateInfo();
                                    if (ccTemplateInfo5 != null && (template_music_id = ccTemplateInfo5.getTemplate_music_id()) != null) {
                                        str7 = template_music_id;
                                    }
                                    c188727au.LJI("music_id", str7);
                                }
                                FMX.LJIIL("cc_music_template_show", c188727au.LIZ);
                            }
                            i = i2;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
            }
            if (LIZ != null) {
                LIZ.setVisibility(8);
            }
            if (!z) {
                c56492MFc.setShowFooter(false);
                c56492MFc.setLoadMoreListener((InterfaceC191547fS) null);
            }
            if ("single_song".equals(this.LJLILLLLZI.LJLJI)) {
                FRW.LIZJ("md_start_activity_to_show_list_duration");
                DetailAwemeListFragment detailAwemeListFragment2 = this.LJLILLLLZI;
                if (!detailAwemeListFragment2.LLII && list != null) {
                    detailAwemeListFragment2.LLII = true;
                    String id = detailAwemeListFragment2.LJLJJI;
                    o.LJIIJ(id, "id");
                }
            } else if ("challenge".equals(this.LJLILLLLZI.LJLJI)) {
                FRW.LIZJ("cd_start_activity_to_show_list_duration");
                DetailAwemeListFragment detailAwemeListFragment3 = this.LJLILLLLZI;
                if (!detailAwemeListFragment3.LLII && list != null) {
                    detailAwemeListFragment3.LLII = true;
                    String id2 = detailAwemeListFragment3.LJLJJI;
                    o.LJIIJ(id2, "id");
                }
            } else if ("sticker_prop_detail".equals(this.LJLILLLLZI.LJLJI)) {
                FRW.LIZJ("sd_start_activity_to_show_list_duration");
            }
        }
        this.LJLILLLLZI.LLIIZ.put(this.LJLIL, z);
        DetailAwemeListFragment detailAwemeListFragment4 = this.LJLILLLLZI;
        InterfaceC56522MGg interfaceC56522MGg = detailAwemeListFragment4.LLFII;
        if (interfaceC56522MGg != null && detailAwemeListFragment4.LJLILLLLZI == this.LJLIL) {
            interfaceC56522MGg.LIZ(detailAwemeListFragment4.lh());
        }
        if (this.LJLILLLLZI.LLFZ != null) {
            C48027It5.LJ("music", "list");
        }
        this.LJLILLLLZI.LLIILZL.put(this.LJLIL, false);
        if (this.LJLILLLLZI.getUserVisibleHint()) {
            DetailAwemeListFragment detailAwemeListFragment5 = this.LJLILLLLZI;
            if (detailAwemeListFragment5.LJLILLLLZI == this.LJLIL && (mfq = detailAwemeListFragment5.LLF) != null) {
                C38816FLg.LIZLLL(new ARunnableS15S0110000_9(mfq, false, 7), 0);
            }
        }
        if (list != null) {
            try {
                if (!list.isEmpty() && ListProtector.get(list, 0) != null && !((Aweme) ListProtector.get(list, 0)).isForMusicDetailLoading()) {
                    C54502LaE.LIZIZ("single_song");
                }
            } catch (Exception e) {
                C78983UzD.LJIJ(e, "music_detail_page_monitor");
            }
        }
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<Aweme> list, boolean z) {
        T9K t9k;
        if (!this.LJLILLLLZI.isViewValid()) {
            return;
        }
        if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable() && (t9k = this.LJLILLLLZI.LJLZ) != null) {
            t9k.LIZIZ();
        }
        if (this.LJLILLLLZI.LLFZ != null) {
            C48027It5.LJ("music", "list");
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        C56492MFc c56492MFc = this.LJLILLLLZI.LLIILII.get(this.LJLIL);
        KUR LIZ = LIZ();
        if (c56492MFc != null && LIZ != null) {
            c56492MFc.resetLoadMoreState();
            if (C79004UzY.LJJIFFI(list) && z) {
                DetailAwemeListFragment detailAwemeListFragment = this.LJLILLLLZI;
                if (detailAwemeListFragment.LJLILLLLZI == this.LJLIL) {
                    detailAwemeListFragment.LJIIJJI();
                    return;
                }
                return;
            }
            List<T> list2 = c56492MFc.mmItems;
            if (list2 == 0 || list2.size() != list.size() || !list2.containsAll(list)) {
                DetailAwemeListFragment detailAwemeListFragment2 = this.LJLILLLLZI;
                c56492MFc.setDataAfterLoadMore(detailAwemeListFragment2.Ml(detailAwemeListFragment2.Hl(list)));
            }
            LIZ.setVisibility(4);
            this.LJLILLLLZI.LLIIZ.put(this.LJLIL, z);
            this.LJLILLLLZI.A8(z);
            if (list2 == 0 || list2.isEmpty()) {
                this.LJLILLLLZI.LL();
            }
        }
    }
}
