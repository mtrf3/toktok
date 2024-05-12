package X;

import Y.ACListenerS27S0101000_9;
import Y.ACallableS83S0200000_6;
import Y.ARunnableS12S0201000_9;
import Y.ARunnableS28S0200000_9;
import Y.AgS76S0300000_9;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.inbox.monitor.InboxSampleRate;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequest;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.ss.android.ugc.aweme.notice.repo.list.bean.RecommendAvatars;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.notification.MusNewNotificationFragment;
import com.ss.android.ugc.aweme.notification.adapter.AdapterStableIdFixer;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.ss.android.ugc.aweme.notification.perf.monitor.AdapterNotifyCrashFixer;
import com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS14S0010000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.MOt */
/* loaded from: classes10.dex */
public final class C56743MOt extends C8HS<MusNotice> implements InterfaceC56810MRi {
    public static final /* synthetic */ int LLFII = 0;
    public final Fragment LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public C56749MOz LJLJI;
    public C56880MUa LJLJJI;
    public List<MusNotice> LJLJJL;
    public C56646MLa LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public List<MusNotice> LJLJLLL;
    public F3Q<User> LJLL;
    public MSP LJLLI;
    public int LJLLILLLL;
    public List<MusNotice> LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public final MPA LJZ;
    public MRG LJZI;
    public int LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public RecyclerView LLF;
    public final MUZ LLFF;
    public LinearLayoutManager LLFFF;

    @Override // X.InterfaceC56810MRi
    public final void onItemClick(int i) {
    }

    public final NotificationCombineVM LLD() {
        return (NotificationCombineVM) this.LLD.getValue();
    }

    public final List<MusNotice> LLF() {
        return (List) this.LL.getValue();
    }

    @Override // X.C8HS
    public final List<MusNotice> getData() {
        List<MusNotice> data = super.getData();
        if (data == null) {
            return new ArrayList();
        }
        return data;
    }

    public static boolean LLFF(MusNotice notice) {
        o.LJIIIZ(notice, "notice");
        if (MPA.LJ.contains(Integer.valueOf(notice.type)) || C47261Igj.LJJIJ(2008).contains(Integer.valueOf(notice.type))) {
            return true;
        }
        return false;
    }

    public final List<MusNotice> LJZ(List<? extends MusNotice> list) {
        boolean z;
        C56646MLa c56646MLa = this.LJLJJLL;
        C56749MOz c56749MOz = this.LJLJI;
        C56880MUa c56880MUa = this.LJLJJI;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (LLD().Aw() == EnumC56648MLc.TOP) {
            z = true;
        } else {
            z = false;
        }
        ORS.LJJLIL(new AqS14S0010000_9(z, 14), arrayList);
        if (z) {
            ListProtector.add(arrayList, 0, LLD().LJLZ.getValue());
        }
        if (c56880MUa != null && this.LJLJLJ) {
            ListProtector.add(arrayList, 0, c56880MUa);
        }
        if (c56749MOz != null && this.LJLJLJ) {
            ListProtector.add(arrayList, 0, c56749MOz);
        }
        if (c56646MLa != null && this.LJLJLJ) {
            ListProtector.add(arrayList, 0, c56646MLa);
        }
        LJZI(arrayList);
        List LLJILJILJ = ORZ.LLJILJILJ(arrayList);
        if (((AdapterStableIdFixer.Meta) AdapterStableIdFixer.LIZIZ.getValue()).enableMonitor) {
            C10K.LIZJ(new ACallableS83S0200000_6((Object) LLJILJILJ, (Object) new Throwable(), 21));
        }
        return arrayList;
    }

    public final void LJZI(List<? extends MusNotice> list) {
        Iterator<? extends MusNotice> it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next().type == 2000) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        LLF().clear();
        if (i > 0) {
            LLF().addAll(list.subList(0, i));
        } else {
            LLF().addAll(list);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0129, code lost:
    
        if (r0 != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0136, code lost:
    
        if (r0 != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0143, code lost:
    
        if (r0 != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x014b, code lost:
    
        if (r1.followRequestNotice != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x015f, code lost:
    
        if (r0 != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0174, code lost:
    
        if (r0 == false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0192, code lost:
    
        if (r0 != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01a0, code lost:
    
        if (r0 != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01a8, code lost:
    
        if (r1.followNotice != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01bd, code lost:
    
        if (r0 == false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01cd, code lost:
    
        if (r0 != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x01e9, code lost:
    
        if (r0 == false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01f8, code lost:
    
        if (r1.tcmNotice != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0208, code lost:
    
        if (r0 != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x021a, code lost:
    
        if (LLD().Aw() == X.EnumC56648MLc.BOTTOM) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0220, code lost:
    
        if (r1.businessAccountNotice != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0226, code lost:
    
        if (r1.promoteNotice != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x022c, code lost:
    
        if (r1.textNotice != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0232, code lost:
    
        if (r1.announcement != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x05b3, code lost:
    
        r17.LJLLLL = true;
        r4 = r17.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x05b7, code lost:
    
        if (r4 == null) goto L870;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x05b9, code lost:
    
        com.bytedance.mt.protector.impl.collections.ListProtector.add(r8, r5 + 1, r17.LJZ);
        java.util.Collections.reverse(r4);
        r8.removeAll(r4);
        notifyDataSetChanged();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ec, code lost:
    
        if (r0 != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f9, code lost:
    
        if ((r1 instanceof X.C56767MPr) != false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x010d, code lost:
    
        if (r0 == false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x011c, code lost:
    
        if (r0 != null) goto L553;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:71:0x00d5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:72:0x00d8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x00db. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x00de. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:75:0x00e1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0243 A[LOOP:2: B:201:0x023d->B:203:0x0243, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x034c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x058c A[LOOP:11: B:435:0x057e->B:438:0x058c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x04f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x056b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LL(java.util.List r18) {
        /*
            Method dump skipped, instructions count: 1668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56743MOt.LL(java.util.List):java.util.List");
    }

    public final void LLFFF(int i) {
        C56767MPr c56767MPr;
        if (i < 0 || i >= getData().size() || getBasicItemViewType(i) != 1001) {
            return;
        }
        try {
            Object obj = ListProtector.get(getData(), i);
            if ((obj instanceof C56767MPr) && (c56767MPr = (C56767MPr) obj) != null) {
                List<MusNotice> LLILLL = ORZ.LLILLL(getData(), i);
                int i2 = 0;
                if (!(LLILLL instanceof Collection) || !LLILLL.isEmpty()) {
                    i2 = 0;
                    for (MusNotice musNotice : LLILLL) {
                        if ((musNotice instanceof MPH) || (musNotice instanceof C56646MLa) || (musNotice instanceof C56880MUa)) {
                            i2++;
                            if (i2 < 0) {
                                C47261Igj.LJJJJIZL();
                                throw null;
                            }
                        }
                    }
                }
                C56760MPk.LJFF(c56767MPr, i - i2);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LLFII(List<? extends MusNotice> list) {
        super.setDataAfterLoadMore(LJZ(list));
    }

    public final void LLFZ(List<CombineLiveNotice> list) {
        if (list == null || list.isEmpty()) {
            this.LJLJJL = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<CombineLiveNotice> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C78963Uyt.LJ(it.next()));
        }
        this.LJLJJL = arrayList;
    }

    public final void LLIIII(TutorialVideoResp tutorialVideoResp) {
        if (tutorialVideoResp == null || tutorialVideoResp.getInfo() == null) {
            this.LJLJJI = null;
        } else {
            TutorialVideoInfo info = tutorialVideoResp.getInfo();
            o.LJI(info);
            this.LJLJJI = C56897MUr.LIZ(info);
        }
        super.setData(LJZ(LL(getData())));
    }

    public final void LLIIIILZ(List<CombineLiveNotice> list) {
        LLFZ(list);
        List<MusNotice> data = getData();
        for (int size = data.size() - 1; -1 < size; size--) {
            if (((BaseNotice) ListProtector.get(data, size)).type == 1001 && (ListProtector.get(data, size) instanceof C56767MPr)) {
                ListProtector.remove(data, size);
            }
        }
        super.setData(LJZ(LL(getData())));
    }

    @Override // X.C4II
    public final int getBasicItemViewType(int i) {
        return C78966Uyw.LJJIIZ((MusNotice) ListProtector.get(getData(), i));
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        if (i < getData().size()) {
            return ((BaseNotice) ListProtector.get(r1, i)).hashCode();
        }
        return 0L;
    }

    @Override // X.MK7
    public final void notifyLoadMoreItemChangedReal(Exception exc) {
        Boolean bool;
        RecyclerView recyclerView = this.LLF;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notifyLoadMoreItemChangedReal: ");
        if (recyclerView != null) {
            bool = Boolean.valueOf(recyclerView.LJJJLL());
        } else {
            bool = null;
        }
        LIZ.append(bool);
        X1D.LIZIZ(LIZ);
        if (recyclerView != null && recyclerView.LJJJLL()) {
            C62822Ol8 c62822Ol8 = AdapterNotifyCrashFixer.LIZIZ;
            if (((AdapterNotifyCrashFixer.Meta) c62822Ol8.getValue()).enable) {
                if (exc != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("catch notify when recyclerview scroll or layout, stack:");
                    LIZ2.append(android.util.Log.getStackTraceString(exc));
                    C221018lt.LIZIZ("AdapterNotifyCrashFixer", X1D.LIZIZ(LIZ2));
                    if (((AdapterNotifyCrashFixer.Meta) c62822Ol8.getValue()).enableSlardar) {
                        C36922EeM.LIZ(exc);
                    }
                    try {
                        if (InboxSampleRate.LIZ(1.0f, "inbox_adapter_notify_error")) {
                            String stackTraceString = android.util.Log.getStackTraceString(exc);
                            o.LJIIIIZZ(stackTraceString, "getStackTraceString(stack)");
                            if (stackTraceString.length() > 2000) {
                                stackTraceString = stackTraceString.substring(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                                o.LJIIIIZZ(stackTraceString, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("stack", stackTraceString);
                            FMX.LJIIL("inbox_adapter_notify_error", linkedHashMap);
                        }
                        C3C5.m7constructorimpl(C76800UCe.LIZ);
                    } catch (Throwable th) {
                        C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    }
                }
                recyclerView.post(new ARunnableS28S0200000_9(exc, this, 88));
                return;
            }
        }
        super.notifyLoadMoreItemChangedReal(exc);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LLF = recyclerView;
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            C0A2 layoutManager = recyclerView.getLayoutManager();
            o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            this.LLFFF = (LinearLayoutManager) layoutManager;
        }
    }

    public final void onDeleteItem(int i) {
        Context context;
        int size;
        User user;
        JSONObject jSONObject;
        String str;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        MPA mpa;
        List<T> list2 = this.mmItems;
        if (list2 != 0 && (context = this.LJLIL.getContext()) != null && (size = list2.size()) > 0 && i >= 0 && i < size) {
            MusNotice musNotice = (MusNotice) ListProtector.get(list2, i);
            if (musNotice != null) {
                int i2 = musNotice.type;
                User user2 = null;
                if (i2 == 2011) {
                    F3Q<User> f3q = this.LJLL;
                    if (f3q != null) {
                        if ((musNotice instanceof MPA) && (mpa = (MPA) musNotice) != null) {
                            user2 = mpa.LIZIZ;
                        }
                        f3q.E1(user2);
                        return;
                    }
                    return;
                }
                if (i2 == 2008) {
                    C56760MPk.LIZIZ(LLD().Aw());
                    EnumC57165Mc5.CONTACTS.markDelete();
                } else {
                    if (i2 == 225) {
                        C57362MfG c57362MfG = new C57362MfG();
                        c57362MfG.LJJLIIIIJ = EnumC57365MfJ.CLOSE;
                        c57362MfG.LJJIIZI("notification_page");
                        c57362MfG.LJJLI = EnumC57366MfK.INBOX_NOTICE;
                        c57362MfG.LJJJJI();
                        GeneralTemplateNotice generalTemplateNotice = musNotice.templateNotice;
                        if (generalTemplateNotice != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null) {
                            user = (User) ORZ.LJLLLL(list);
                        } else {
                            user = null;
                        }
                        c57362MfG.LJJJJIZL(user);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        GeneralTemplateNotice generalTemplateNotice2 = musNotice.templateNotice;
                        if (generalTemplateNotice2 != null && (str = generalTemplateNotice2.messageExtra) != null) {
                            jSONObject = new JSONObject(str);
                        } else {
                            jSONObject = new JSONObject();
                        }
                        Iterator<String> keys = jSONObject.keys();
                        o.LJIIIIZZ(keys, "json.keys()");
                        while (keys.hasNext()) {
                            String key = keys.next();
                            try {
                                if (o.LJ(key, "business_extra")) {
                                    JSONObject jSONObject2 = new JSONObject(jSONObject.optString(key));
                                    Iterator<String> keys2 = jSONObject2.keys();
                                    o.LJIIIIZZ(keys2, "business.keys()");
                                    while (keys2.hasNext()) {
                                        String businessKey = keys2.next();
                                        o.LJIIIIZZ(businessKey, "businessKey");
                                        String optString = jSONObject2.optString(businessKey);
                                        o.LJIIIIZZ(optString, "business.optString(businessKey)");
                                        linkedHashMap.put(businessKey, optString);
                                    }
                                } else if (!linkedHashMap.containsKey(key)) {
                                    o.LJIIIIZZ(key, "key");
                                    String optString2 = jSONObject.optString(key);
                                    o.LJIIIIZZ(optString2, "json.optString(key)");
                                    linkedHashMap.put(key, optString2);
                                }
                                C3C5.m7constructorimpl(C76800UCe.LIZ);
                            } catch (Throwable th) {
                                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                            }
                        }
                        c57362MfG.LIZ(linkedHashMap);
                        c57362MfG.LJIILIIL();
                    }
                    MusNotificationApiManager.LIZ(musNotice.nid).LJ(new AgS76S0300000_9(this, context, musNotice, 1), C10K.LJIIIIZZ, null);
                }
            }
            RecyclerView recyclerView = this.LLF;
            if (recyclerView != null && recyclerView.LJJJLL()) {
                recyclerView.post(new ARunnableS12S0201000_9(i, musNotice, this, 6));
            } else {
                LJZL(i, musNotice);
            }
        }
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LLF = null;
        super.onDetachedFromRecyclerView(recyclerView);
        this.LLFFF = null;
    }

    @Override // X.InterfaceC56810MRi
    public final void onItemLongClick(int i) {
        FragmentManager fragmentManager;
        if (i >= getData().size() || this.LJLIL.getContext() == null || (fragmentManager = this.LJLIL.getFragmentManager()) == null) {
            return;
        }
        ACListenerS27S0101000_9 aCListenerS27S0101000_9 = new ACListenerS27S0101000_9(this, i, 3);
        C245319jz c245319jz = new C245319jz();
        C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.efd);
        LIZIZ.LIZJ = 1;
        LIZIZ.LJ = aCListenerS27S0101000_9;
        c245319jz.LIZIZ(LIZIZ);
        c245319jz.LIZJ().show(fragmentManager, "DELETE_NOTICE_ACTION_SHEET_TAG");
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        ViewOnClickListenerC56908MVc viewOnClickListenerC56908MVc;
        o.LJIIIZ(holder, "holder");
        ML4.LIZIZ();
        super.onViewAttachedToWindow(holder);
        if ((holder instanceof ViewOnClickListenerC56908MVc) && (viewOnClickListenerC56908MVc = (ViewOnClickListenerC56908MVc) holder) != null) {
            viewOnClickListenerC56908MVc.onAttached();
        }
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        ViewOnClickListenerC56908MVc viewOnClickListenerC56908MVc;
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if ((holder instanceof ViewOnClickListenerC56908MVc) && (viewOnClickListenerC56908MVc = (ViewOnClickListenerC56908MVc) holder) != null) {
            viewOnClickListenerC56908MVc.onDetached();
        }
    }

    @Override // X.C8HS
    public final void setData(List<MusNotice> list) {
        int intValue;
        this.LJLJLLL = list;
        int i = 0;
        this.LJLLILLLL = 0;
        this.LJLLJ = null;
        this.LJLLL = false;
        this.LJLLLL = false;
        this.LJLZ = true;
        super.setData(LJZ(LL(list)));
        try {
            LinearLayoutManager linearLayoutManager = this.LLFFF;
            if (linearLayoutManager != null) {
                Integer valueOf = Integer.valueOf(linearLayoutManager.LLILLJJLI());
                if (valueOf != null && valueOf.intValue() >= 0 && (intValue = valueOf.intValue()) >= 0) {
                    while (true) {
                        LLFFF(i);
                        if (i == intValue) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        int i2 = this.LJLJL;
        Long l = MOU.LIZIZ;
        if (l != null) {
            MOU.LIZ(Integer.valueOf(i2), System.currentTimeMillis() - l.longValue(), "notice_list_total");
        }
        MOU.LIZIZ = null;
    }

    @Override // X.C8HS
    public final void setDataAfterLoadMore(List<MusNotice> list) {
        super.setDataAfterLoadMore(LJZ(LL(list)));
        int i = this.LJLJL;
        Long l = MOU.LIZIZ;
        if (l != null) {
            MOU.LIZ(Integer.valueOf(i), System.currentTimeMillis() - l.longValue(), "notice_list_total");
        }
        MOU.LIZIZ = null;
    }

    public static final /* synthetic */ void LJLLLLLL(C56743MOt c56743MOt, Exception exc) {
        super.notifyLoadMoreItemChangedReal(exc);
    }

    public static final /* synthetic */ void LJLZ(C56743MOt c56743MOt, List list) {
        super.setData(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZL(int r5, com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r6) {
        /*
            r4 = this;
            java.util.List<T> r0 = r4.mmItems
            if (r0 != 0) goto L5
            return
        L5:
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r0, r5)
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> r0 = r4.LJLJLLL
            if (r0 == 0) goto L13
            java.util.Collection r0 = X.C65777Prh.LIZ(r0)
            r0.remove(r6)
        L13:
            java.util.List r0 = r4.LLF()
            java.util.Collection r0 = X.C65777Prh.LIZ(r0)
            r0.remove(r6)
            androidx.fragment.app.Fragment r1 = r4.LJLIL
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.MusNewNotificationFragment"
            kotlin.jvm.internal.o.LJII(r1, r0)
            com.ss.android.ugc.aweme.notification.MusNewNotificationFragment r1 = (com.ss.android.ugc.aweme.notification.MusNewNotificationFragment) r1
            if (r6 == 0) goto L34
            com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel r0 = r1.Kl()
            java.util.List r0 = r0.getItems()
            r0.remove(r6)
        L34:
            com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM r0 = r4.LLD()
            X.Ol8 r0 = r0.LJZ
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = X.C65777Prh.LIZ(r0)
            r0.remove(r6)
            java.util.List<T> r3 = r4.mmItems
            r2 = 0
            if (r3 != 0) goto L5d
        L4a:
            r4.notifyItemRemoved(r5)
        L4d:
            java.util.List r0 = r4.getData()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5c
            X.Pro<X.UCe> r0 = r4.LJLILLLLZI
            r0.invoke()
        L5c:
            return
        L5d:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L64
            goto L4a
        L64:
            int r1 = r3.size()
            r0 = 1
            if (r1 != r0) goto L7a
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r2)
            boolean r0 = r0 instanceof X.MPH
            if (r0 == 0) goto L4a
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r3, r2)
        L76:
            r4.notifyDataSetChanged()
            goto L4d
        L7a:
            int r0 = r3.size()
            int r1 = r0 + (-2)
            if (r1 < 0) goto L4a
            r2 = 0
        L83:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r2)
            boolean r0 = r0 instanceof X.MPH
            if (r0 == 0) goto La9
            int r0 = r2 + 1
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r0)
            boolean r0 = r0 instanceof X.MPH
            if (r0 == 0) goto La9
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r3, r2)
            if (r2 != 0) goto L76
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r2)
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r0 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice) r0
            int r1 = r0.timeLineType
            r0 = 5
            if (r1 != r0) goto L76
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r3, r2)
            goto L76
        La9:
            if (r2 == r1) goto L4a
            int r2 = r2 + 1
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56743MOt.LJZL(int, com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice):void");
    }

    public final void LLII(NoticeCombineDatas combines, int i) {
        int i2;
        List<UrlModel> list;
        o.LJIIIZ(combines, "combines");
        RecommendAvatars recommendAvatars = combines.getRecommendAvatars();
        C77413UZt.LJIIZILJ();
        if (recommendAvatars == null || (list = recommendAvatars.avatarList) == null || list.isEmpty()) {
            this.LJLJI = null;
        } else {
            this.LJLJI = new C56749MOz(recommendAvatars.avatarList, recommendAvatars.enable, recommendAvatars.LJLIL);
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from_merge", "message");
            hashMap.put("_param_live_platform", "live");
            FMX.LJIIL("livesdk_live_merge_show", hashMap);
            LogHelperImpl.LJIIIIZZ().LIZLLL();
            LiveOuterService.LJJJLL().LJII();
            C54285LSf.LIZ.LIZ(0, "ttlive_inbox_topLives_entrance", new HashMap());
        }
        ArrayList arrayList = new ArrayList();
        FollowRequest followRequest = combines.getFollowRequest();
        if (followRequest != null) {
            i2 = followRequest.getFollowRequestCount();
        } else {
            i2 = 0;
        }
        LLIFFJFJJ(arrayList, i2, false);
        LLFZ(combines.getLiveNotices());
        List<MusNotice> LJZ = LJZ(LL(getData()));
        RecyclerView recyclerView = this.LLF;
        if (recyclerView != null && recyclerView.LJJJLL() && ((AdapterNotifyCrashFixer.Meta) AdapterNotifyCrashFixer.LIZIZ.getValue()).enable) {
            recyclerView.post(new ARunnableS28S0200000_9(LJZ, this, 89));
        } else {
            super.setData(LJZ);
        }
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.LLFF.LJI(viewHolder, i);
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        return this.LLFF.LJII(parent, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56743MOt(MusNewNotificationFragment musNewNotificationFragment, String enterFrom, AqS159S0100000_9 aqS159S0100000_9) {
        super(false, 1, null);
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = musNewNotificationFragment;
        this.LJLILLLLZI = aqS159S0100000_9;
        this.LJLJL = C56702MNe.LIZ;
        this.LJLJLJ = true;
        new HashMap();
        this.LJLZ = true;
        this.LJZ = new MPA(2002, null, 12);
        this.LL = C221108m2.LIZIZ(EAU.LJLIL);
        this.LLD = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1075));
        setLoadEmptyText(R.string.h7m);
        this.LLFF = new MUZ(new C56748MOy(this), false);
    }

    public final void LLIFFJFJJ(List list, int i, boolean z) {
        if (INB.LIZIZ()) {
            return;
        }
        if (i <= 0) {
            this.LJLJJLL = null;
        } else {
            this.LJLJJLL = new C56646MLa(i, list);
        }
        if (z) {
            super.setData(LJZ(getData()));
        }
    }
}
