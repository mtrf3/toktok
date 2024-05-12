package kotlin.jvm.internal;

import X.AbstractC1038245q;
import X.AbstractC65781Prl;
import X.AbstractC90763hI;
import X.C025908h;
import X.C105814Dh;
import X.C105964Dw;
import X.C1HQ;
import X.C32I;
import X.C34B;
import X.C3C8;
import X.C3JS;
import X.C3KQ;
import X.C3L4;
import X.C3L5;
import X.C43I;
import X.C45S;
import X.C48841JEv;
import X.C4AS;
import X.C4EF;
import X.C51029K0z;
import X.C62846OlW;
import X.C63120Opw;
import X.C76800UCe;
import X.C772831o;
import X.C77800Ug8;
import X.C79146V4k;
import X.C80133Cn;
import X.C80533Eb;
import X.C81563Ia;
import X.C81633Ih;
import X.C81843Jc;
import X.C85323Wm;
import X.C86913b5;
import X.C87503c2;
import X.C8W0;
import X.C91243i4;
import X.C94393n9;
import X.E2C;
import X.EnumC110124Tw;
import X.EnumC87143bS;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import X.MBB;
import X.OSZ;
import X.SYL;
import X.X1D;
import X.XKX;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.fragment.StickerSetContentFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.tab.fragment.StickerStoreTabFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.view.TakoInputView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.voice2text.vm.TakoSpeechViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.GroupInfo;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes2.dex */
public class AqS120S0300000_1 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    public final void invoke$0(C3C8 selectSubscribe, C43I<Boolean> c43i) {
        int i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        TuxTextView tuxTextView = (TuxTextView) ((View) this.l0).findViewById(R.id.efo);
        String string = ((Context) this.l1).getString(R.string.gxy);
        o.LJIIIIZZ(string, "context.getString(R.stri…roup_chat_members_number)");
        Object[] objArr = new Object[1];
        C63120Opw LIZLLL = ((AbstractC90763hI) this.l2).LIZLLL();
        if (LIZLLL != null) {
            i = LIZLLL.getMemberCount();
        } else {
            i = 1;
        }
        objArr[0] = Integer.valueOf(i);
        C025908h.LJ(objArr, 1, string, "format(format, *args)", tuxTextView);
    }

    public static final Object invoke$0(AqS120S0300000_1 aqS120S0300000_1, Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        EnumC110124Tw messageViewType = (EnumC110124Tw) obj2;
        o.LJIIIZ(messageViewType, "messageViewType");
        if (!C48841JEv.LJIILLIIL((InterfaceC70422pa) aqS120S0300000_1.l0)) {
            C85323Wm LIZ = C772831o.LIZ();
            C1HQ LIZ2 = C77800Ug8.LIZ(LIZ, "onEventV3");
            LIZ2.put("count", String.valueOf(intValue));
            LIZ.LIZIZ("chat_room_vh_preload", LIZ2);
        }
        C79146V4k.LJJIIJ(((InterfaceC70422pa) aqS120S0300000_1.l0).getCoroutineContext());
        return ((AbstractC1038245q) aqS120S0300000_1.l1).createViewHolder((RecyclerView) aqS120S0300000_1.l2, messageViewType.getViewType());
    }

    public static final Object invoke$1(AqS120S0300000_1 aqS120S0300000_1, Object obj, Object obj2) {
        String str;
        Resources resources;
        int i;
        int i2;
        C8W0 selectSubscribe = (C8W0) obj;
        GroupInfo groupInfo = (GroupInfo) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (groupInfo != null) {
            C62846OlW c62846OlW = (C62846OlW) aqS120S0300000_1.l0;
            TuxTextView tuxTextView = (TuxTextView) aqS120S0300000_1.l1;
            TuxTextView tuxTextView2 = (TuxTextView) aqS120S0300000_1.l2;
            C45S.LIZJ(c62846OlW, C4AS.LJIIJ(groupInfo.getAvatarUrl()), "GroupInviteUIAssem");
            tuxTextView.setText(groupInfo.getName());
            Context context = selectSubscribe.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                Integer groupSize = groupInfo.getGroupSize();
                if (groupSize != null) {
                    i = groupSize.intValue();
                } else {
                    i = 0;
                }
                Object[] objArr = new Object[1];
                Integer groupSize2 = groupInfo.getGroupSize();
                if (groupSize2 != null) {
                    i2 = groupSize2.intValue();
                } else {
                    i2 = 0;
                }
                objArr[0] = Integer.valueOf(i2);
                str = resources.getQuantityString(R.plurals.g9, i, objArr);
            } else {
                str = null;
            }
            tuxTextView2.setText(str);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS120S0300000_1 aqS120S0300000_1, Object selectSubscribe, Object obj) {
        C105964Dw it = (C105964Dw) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (it.LJLILLLLZI) {
            if (it.LJLIL.length() == 0) {
                TakoSpeechViewModel takoSpeechViewModel = (TakoSpeechViewModel) aqS120S0300000_1.l0;
                C105814Dh c105814Dh = new C105814Dh(null, 1, null);
                takoSpeechViewModel.getClass();
                takoSpeechViewModel.setState(new AqS167S0100000_1((Exception) c105814Dh, 117));
            } else {
                TakoInputView takoInputView = (TakoInputView) aqS120S0300000_1.l1;
                ChatViewModel chatViewModel = takoInputView.LLIILZL;
                if (chatViewModel != null) {
                    ChatViewModel.jv0(chatViewModel, it.LJLIL, takoInputView.LJLZ.getConversationId(), ((TakoInputView) aqS120S0300000_1.l1).LJLZ, null, null, E2C.LIZJ("is_voice_input_msg", "1"), 24);
                }
                ((C4EF) aqS120S0300000_1.l2).LIZ(false);
            }
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AqS120S0300000_1 aqS120S0300000_1, Object obj, Object obj2) {
        aqS120S0300000_1.invoke$0((C3C8) obj, (C43I) obj2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS120S0300000_1 aqS120S0300000_1, Object obj, Object obj2) {
        C3L5 LIZ;
        String str;
        Object LJ;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        List chunk = (List) obj2;
        o.LJIIIZ(chunk, "chunk");
        int size = ((List) aqS120S0300000_1.l0).size();
        C3JS c3js = (C3JS) aqS120S0300000_1.l1;
        if (size >= c3js.LJ) {
            Iterator it = ((List) aqS120S0300000_1.l0).iterator();
            if (it.hasNext()) {
                long sortOrder = ((C63120Opw) it.next()).getSortOrder();
                while (it.hasNext()) {
                    long sortOrder2 = ((C63120Opw) it.next()).getSortOrder();
                    if (sortOrder > sortOrder2) {
                        sortOrder = sortOrder2;
                    }
                }
                c3js.LIZIZ = sortOrder;
                ((C3JS) aqS120S0300000_1.l1).LIZJ = true;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("chunk size: ");
            LIZ2.append(chunk.size());
            C81843Jc.LIZIZ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ2));
            C81563Ia c81563Ia = null;
            if (booleanValue && C3KQ.LIZ().batchConvertSize > 0) {
                LJ = XKX.LJ(MBB.INSTANCE, new C80133Cn((C3JS) aqS120S0300000_1.l1, chunk, null));
                Iterable iterable = (Iterable) LJ;
                int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(iterable, 10));
                if (LJJIIZ < 16) {
                    LJJIIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
                for (Object obj3 : iterable) {
                    linkedHashMap.put(((IMUser) obj3).getUid(), obj3);
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("preload user map size : ");
                LIZ3.append(linkedHashMap.size());
                C81843Jc.LIZIZ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ3));
                c81563Ia = new C81563Ia(linkedHashMap, (Set) aqS120S0300000_1.l2);
            }
            Iterator it2 = chunk.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C63120Opw c63120Opw = (C63120Opw) it2.next();
                int size2 = ((List) aqS120S0300000_1.l0).size();
                C3JS c3js2 = (C3JS) aqS120S0300000_1.l1;
                if (size2 >= c3js2.LJ) {
                    Iterator it3 = ((List) aqS120S0300000_1.l0).iterator();
                    if (it3.hasNext()) {
                        long sortOrder3 = ((C63120Opw) it3.next()).getSortOrder();
                        while (it3.hasNext()) {
                            long sortOrder4 = ((C63120Opw) it3.next()).getSortOrder();
                            if (sortOrder3 > sortOrder4) {
                                sortOrder3 = sortOrder4;
                            }
                        }
                        c3js2.LIZIZ = sortOrder3;
                        ((C3JS) aqS120S0300000_1.l1).LIZJ = true;
                    } else {
                        throw new NoSuchElementException();
                    }
                } else {
                    try {
                        LIZ = C81633Ih.LIZ(c63120Opw, c81563Ia);
                    } catch (Exception e) {
                        C34B.LJ("SessionRefactor-SessionListDataSource", e);
                        ((C3JS) aqS120S0300000_1.l1).LJIIIZ++;
                    }
                    if (LIZ == null) {
                        ((C3JS) aqS120S0300000_1.l1).LJIIIZ++;
                    } else if (((C3JS) aqS120S0300000_1.l1).LIZ.LIZLLL.invoke(LIZ).booleanValue()) {
                        ((C3JS) aqS120S0300000_1.l1).getClass();
                        OSZ LIZ4 = C3JS.LIZ(c63120Opw);
                        if (LIZ4 != null && (str = (String) LIZ4.getFirst()) != null && str.length() > 0 && ((Set) aqS120S0300000_1.l2).contains(LIZ4.getFirst())) {
                            ((Set) aqS120S0300000_1.l2).remove(LIZ4.getFirst());
                            C80533Eb.LJIIJ((String) LIZ4.getFirst(), (String) LIZ4.getSecond());
                        }
                        ((List) aqS120S0300000_1.l0).add(c63120Opw);
                        Map<String, C3L4> map = ((C3JS) aqS120S0300000_1.l1).LIZLLL;
                        String LJFF = LIZ.LJFF();
                        o.LJIIIIZZ(LJFF, "session.sessionID");
                        map.put(LJFF, LIZ);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AqS120S0300000_1 aqS120S0300000_1, Object selectSubscribe, Object obj) {
        List filterList = (List) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(filterList, "filterList");
        ((SYL) aqS120S0300000_1.l0).getState().LJIILLIIL(filterList);
        Iterator it = filterList.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (((C91243i4) it.next()).LJLILLLLZI) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() >= 0) {
            StickerStoreTabFragment stickerStoreTabFragment = (StickerStoreTabFragment) aqS120S0300000_1.l1;
            C94393n9 c94393n9 = (C94393n9) aqS120S0300000_1.l2;
            int intValue = valueOf.intValue();
            if (((C91243i4) ListProtector.get(filterList, intValue)).LJLIL != EnumC87143bS.ADDED.getType()) {
                List<Fragment> LJJJJLI = stickerStoreTabFragment.getChildFragmentManager().LJJJJLI();
                o.LJIIIIZZ(LJJJJLI, "childFragmentManager.fragments");
                for (Fragment fragment : LJJJJLI) {
                    if (fragment instanceof StickerSetContentFragment) {
                        StickerSetContentFragment stickerSetContentFragment = (StickerSetContentFragment) fragment;
                        Integer num = stickerSetContentFragment.LJLJJL;
                        int type = EnumC87143bS.ADDED.getType();
                        if (num != null && num.intValue() == type) {
                            StickerSetContentViewModel stickerSetContentViewModel = (StickerSetContentViewModel) stickerSetContentFragment.LJLJJI.getValue();
                            if (o.LJ(((C87503c2) stickerSetContentViewModel.getState()).LJLILLLLZI, C86913b5.LIZ)) {
                                stickerSetContentViewModel.iv0();
                            }
                        }
                    }
                }
            }
            c94393n9.setCurrentItem(intValue, false);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS120S0300000_1(InterfaceC70422pa interfaceC70422pa, AbstractC1038245q abstractC1038245q, RecyclerView recyclerView, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC70422pa;
        this.l1 = abstractC1038245q;
        this.l2 = recyclerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS120S0300000_1(C62846OlW c62846OlW, TuxTextView tuxTextView, TuxTextView tuxTextView2, int i) {
        super(2);
        this.$t = i;
        this.l0 = c62846OlW;
        this.l1 = tuxTextView;
        this.l2 = tuxTextView2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS120S0300000_1(SYL syl, StickerStoreTabFragment stickerStoreTabFragment, C94393n9 c94393n9, int i) {
        super(2);
        this.$t = i;
        this.l0 = syl;
        this.l1 = stickerStoreTabFragment;
        this.l2 = c94393n9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS120S0300000_1(View view, Context context, AbstractC90763hI abstractC90763hI, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = context;
        this.l2 = abstractC90763hI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS120S0300000_1(TakoInputView takoInputView, C4EF c4ef, TakoSpeechViewModel takoSpeechViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoSpeechViewModel;
        this.l1 = takoInputView;
        this.l2 = c4ef;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS120S0300000_1(List list, List<C63120Opw> list2, C3JS c3js, Set<String> set) {
        super(2);
        this.$t = set;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c3js;
    }
}
