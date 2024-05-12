package X;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.live.gift.GiftDialogDismissEvent;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.gift.GiftLimitNotificationEvent;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelHideOptSetting;
import com.bytedance.android.livesdk.pack.viewmodel.BagListViewModel;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Cs3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32675Cs3 implements InterfaceC32548Cq0 {
    public final /* synthetic */ C32676Cs4 LIZ;

    public C32675Cs3(C32676Cs4 c32676Cs4) {
        this.LIZ = c32676Cs4;
    }

    @Override // X.InterfaceC32548Cq0
    public final void LIZ(C32543Cpv stateManager, EnumC32542Cpu event) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        ViewTreeObserver viewTreeObserver3;
        ViewTreeObserver viewTreeObserver4;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList;
        String str;
        MutableLiveData<AbstractC32698CsQ<? extends C30896CAq>> mutableLiveData2;
        int i;
        C32580CqW c32580CqW;
        int i2;
        MutableLiveData<Boolean> mutableLiveData3;
        DataChannel dataChannel;
        ImageView imageView;
        ImageView imageView2;
        C32681Cs9 c32681Cs9;
        MutableLiveData<List<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData4;
        List<AbstractC32698CsQ<? extends C30896CAq>> value;
        MutableLiveData<AbstractC32698CsQ<? extends C30896CAq>> mutableLiveData5;
        MutableLiveData<List<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData6;
        List<AbstractC32698CsQ<? extends C30896CAq>> value2;
        MutableLiveData<AbstractC32698CsQ<? extends C30896CAq>> mutableLiveData7;
        MutableLiveData<List<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData8;
        GiftLeafRootViewModel LJJIJLIJ;
        DataChannel dataChannel2;
        DataChannel dataChannel3;
        DataChannel dataChannel4;
        C0A2 c0a2;
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData9;
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData10;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value3;
        GiftPanelLeafViewModel LJJIJIL;
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData11;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value4;
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData12;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value5;
        o.LJIIIZ(stateManager, "stateManager");
        o.LJIIIZ(event, "event");
        int i3 = C32546Cpy.LIZ[event.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return;
            }
            C32676Cs4 c32676Cs4 = this.LIZ;
            c32676Cs4.LLIIJLIL = false;
            c32676Cs4.LLIIL = false;
            C32785Ctp.LJIILIIL.LJIIL = true;
            c32676Cs4.LLIZ = false;
            C32694CsM c32694CsM = C32694CsM.LIZ;
            C32694CsM.LJJIL = SystemClock.uptimeMillis();
            C32128CjE c32128CjE = C32129CjF.LIZ;
            C32710Csc.LJIIJJI(new C32722Cso(c32128CjE.LJ, c32676Cs4.LLILL, c32676Cs4.LLILLIZIL, C32694CsM.LIZLLL, C32694CsM.LJJI, false, Math.min(C32694CsM.LJJII + C32694CsM.LJJIFFI, C32694CsM.LJJI), Math.min(C32694CsM.LJJII, C32694CsM.LJJI)), new C32730Csw(c32694CsM), new C32712Cse(c32694CsM, c32676Cs4.LLJJIJI - c32128CjE.LJIIJ), new C32711Csd(c32694CsM), SystemClock.uptimeMillis() - c32676Cs4.LLJJIJI, Math.min(C32694CsM.LJJIJL, Math.min(C32694CsM.LJJIL, C32694CsM.LJJIJLIJ)) - c32128CjE.LJIIJ, C32694CsM.LIZIZ(), C32694CsM.LJFF, 0L, 0L, 0);
            C32694CsM.LIZ();
            if (c32676Cs4.LJJIJIIJIL() == c32676Cs4.LJJIJIIJI()) {
                long LJJJI = c32676Cs4.LJJJI();
                c32676Cs4.LJJLIIIJILLIZJL(C32778Cti.LIZ(C15380j0.LIZLLL()));
                long LJJJI2 = c32676Cs4.LJJJI();
                GiftPanelLeafViewModel LJJIJIL2 = c32676Cs4.LJJIJIL();
                if (LJJIJIL2 != null && (mutableLiveData12 = LJJIJIL2.LJLILLLLZI) != null && (value5 = mutableLiveData12.getValue()) != null) {
                    LJJJI2 = c32676Cs4.LJJJ(value5, true);
                }
                if (LJJJI != LJJJI2 && (LJJIJIL = c32676Cs4.LJJIJIL()) != null && (mutableLiveData11 = LJJIJIL.LJLILLLLZI) != null && (value4 = mutableLiveData11.getValue()) != null) {
                    Iterator<AbstractC32698CsQ<? extends C30896CAq>> it = value4.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        AbstractC32698CsQ<? extends C30896CAq> next = it.next();
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = next;
                            if (abstractC32698CsQ != null && abstractC32698CsQ.LIZJ() == LJJJI) {
                                abstractC32698CsQ.LIZJ = false;
                                abstractC32698CsQ.LIZLLL = false;
                                abstractC32698CsQ.LJFF = null;
                                abstractC32698CsQ.LJ = null;
                                abstractC32698CsQ.LJII = "";
                                c32676Cs4.LJJJJLI(c32676Cs4.LJJIL(Long.valueOf(LJJJI)));
                                C32681Cs9 c32681Cs92 = c32676Cs4.LJZ;
                                if (c32681Cs92 != null) {
                                    c32681Cs92.notifyItemChanged(i4, abstractC32698CsQ);
                                }
                            }
                            i4 = i5;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
                c32676Cs4.LJJLIIIJILLIZJL(LJJJI2);
                GiftPanelLeafViewModel LJJIJIL3 = c32676Cs4.LJJIJIL();
                if (LJJIJIL3 != null && (mutableLiveData10 = LJJIJIL3.LJLILLLLZI) != null && (value3 = mutableLiveData10.getValue()) != null) {
                    Iterator<AbstractC32698CsQ<? extends C30896CAq>> it2 = value3.iterator();
                    int i6 = 0;
                    while (it2.hasNext()) {
                        AbstractC32698CsQ<? extends C30896CAq> next2 = it2.next();
                        int i7 = i6 + 1;
                        if (i6 >= 0) {
                            AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2 = next2;
                            if (abstractC32698CsQ2 != null && abstractC32698CsQ2.LIZJ() == LJJJI2) {
                                abstractC32698CsQ2.LIZJ = true;
                                abstractC32698CsQ2.LJII = C32833Cub.LIZIZ();
                                c32676Cs4.LJJJJLI(c32676Cs4.LJJIL(Long.valueOf(LJJJI2)));
                                C32681Cs9 c32681Cs93 = c32676Cs4.LJZ;
                                if (c32681Cs93 != null) {
                                    c32681Cs93.notifyItemChanged(i6, abstractC32698CsQ2);
                                }
                            }
                            i6 = i7;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
            }
            GiftPanelLeafViewModel LJJIJIL4 = c32676Cs4.LJJIJIL();
            if (LJJIJIL4 != null && (mutableLiveData9 = LJJIJIL4.LJLILLLLZI) != null) {
                linkedList = mutableLiveData9.getValue();
            } else {
                linkedList = null;
            }
            int LJJJJI = C32676Cs4.LJJJJI(c32676Cs4.LJJJI(), linkedList);
            if (LJJJJI != -1) {
                RunnableC31065CHd runnableC31065CHd = c32676Cs4.LJLZ;
                if (runnableC31065CHd != null) {
                    c0a2 = runnableC31065CHd.getLayoutManager();
                } else {
                    c0a2 = null;
                }
                boolean z = c0a2 instanceof GridLayoutManager;
                RunnableC31065CHd runnableC31065CHd2 = c32676Cs4.LJLZ;
                if (runnableC31065CHd2 != null) {
                    runnableC31065CHd2.LJLI(LJJJJI);
                }
            }
            if (!c32676Cs4.LJLLI) {
                GiftLeafRootViewModel LJJIJLIJ2 = c32676Cs4.LJJIJLIJ();
                if (LJJIJLIJ2 != null && (dataChannel4 = LJJIJLIJ2.LJLIL) != null) {
                    dataChannel4.jv0(c32676Cs4);
                }
                GiftLeafRootViewModel LJJIJLIJ3 = c32676Cs4.LJJIJLIJ();
                if (LJJIJLIJ3 != null && (dataChannel3 = LJJIJLIJ3.LJLIL) != null) {
                    dataChannel3.rv0(GiftDialogVisibilityChannel.class, Boolean.FALSE);
                }
                if (!c32676Cs4.LLIZLLLIL && (LJJIJLIJ = c32676Cs4.LJJIJLIJ()) != null && (dataChannel2 = LJJIJLIJ.LJLIL) != null) {
                    dataChannel2.qv0(GiftDialogDismissEvent.class, Boolean.FALSE);
                }
            }
            c32676Cs4.LLJJ = false;
            c32676Cs4.LLIIJI.LIZLLL();
            C32781Ctl.LIZ.LIZLLL();
            C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
            C32128CjE c32128CjE2 = C32129CjF.LIZ;
            String str2 = c32128CjE2.LJ;
            c32785Ctp.getClass();
            BZI LIZ = C28787BRn.LIZ("tab_leave");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(C77283UUt.LIZ, "gift_dialog_request_id");
            LIZ.LJIJJ(GiftManager.inst().getTabName(c32128CjE2.LJIIIIZZ), "live");
            LIZ.LJIJJ(Integer.valueOf(GiftManager.inst().getTabLocation(c32128CjE2.LJIIIIZZ)), "tab_position");
            LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
            LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
            LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
            if (str2 == null) {
                str2 = "icon";
            }
            LIZ.LJIJJ(str2, "gift_enter_from");
            LIZ.LJIJJ(C31120CJg.LJ().getDesc(), "send_gift_scene");
            if (C32785Ctp.LJI()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJIJJ(str, "is_anchor");
            LIZ.LJIJJ(C77283UUt.LIZ, "gift_dialog_request_id");
            LIZ.LJIJJ(Long.valueOf(C30725C4b.LIZ()), "timestamp");
            LIZ.LJIJJ(Long.valueOf(C30725C4b.LIZ() - c32128CjE2.LJIIIZ), "from_panel_duration");
            LIZ.LJIJJ(Long.valueOf((C30725C4b.LIZ() - c32785Ctp.LJFF) / 1000), "stay_duration");
            LIZ.LJJIIJZLJL();
            BagListViewModel LJJIJ = c32676Cs4.LJJIJ();
            if (LJJIJ != null && (mutableLiveData8 = LJJIJ.LJLILLLLZI) != null) {
                mutableLiveData8.removeObserver(c32676Cs4.LLJLLL);
            }
            BagListViewModel LJJIJ2 = c32676Cs4.LJJIJ();
            if (LJJIJ2 != null && (mutableLiveData7 = LJJIJ2.LJLJI) != null) {
                mutableLiveData7.removeObserver(c32676Cs4.LLJZ);
            }
            BagListViewModel LJJIJ3 = c32676Cs4.LJJIJ();
            if (LJJIJ3 != null && (mutableLiveData6 = LJJIJ3.LJLILLLLZI) != null && (value2 = mutableLiveData6.getValue()) != null) {
                for (AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ3 : value2) {
                    if (abstractC32698CsQ3 != null) {
                        abstractC32698CsQ3.LIZJ = false;
                    }
                }
            }
            BagListViewModel LJJIJ4 = c32676Cs4.LJJIJ();
            if (LJJIJ4 != null) {
                mutableLiveData2 = LJJIJ4.LJLJI;
            } else {
                mutableLiveData2 = null;
            }
            LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList2 = null;
            if (mutableLiveData2 != null) {
                mutableLiveData2.setValue(null);
            }
            BagListViewModel LJJIJ5 = c32676Cs4.LJJIJ();
            if (LJJIJ5 != null && (mutableLiveData5 = LJJIJ5.LJLJJI) != null) {
                mutableLiveData5.setValue(null);
            }
            if (c32676Cs4.LJJIJIIJI() == 16 && (c32681Cs9 = c32676Cs4.LJZ) != null) {
                BagListViewModel LJJIJ6 = c32676Cs4.LJJIJ();
                if (LJJIJ6 != null && (mutableLiveData4 = LJJIJ6.LJLILLLLZI) != null && (value = mutableLiveData4.getValue()) != null) {
                    linkedList2 = new LinkedList<>();
                    linkedList2.addAll(value);
                }
                c32681Cs9.LJZ(linkedList2);
            }
            if (!c32676Cs4.LJLL) {
                if (LiveGiftPanelHideOptSetting.INSTANCE.getValue()) {
                    DialogC38611fN dialogC38611fN = c32676Cs4.LJLJLLL;
                    if (dialogC38611fN != null) {
                        dialogC38611fN.hide();
                    }
                } else {
                    DialogC38611fN dialogC38611fN2 = c32676Cs4.LJLJLLL;
                    if (dialogC38611fN2 != null) {
                        dialogC38611fN2.dismiss();
                    }
                }
            }
            View view = c32676Cs4.LJLJJI;
            if (view != null && (imageView2 = (ImageView) view.findViewById(R.id.f9k)) != null) {
                i = 8;
                imageView2.setVisibility(8);
            } else {
                i = 8;
            }
            View view2 = c32676Cs4.LJLJJI;
            if (view2 != null && (imageView = (ImageView) view2.findViewById(R.id.f9l)) != null) {
                imageView.setVisibility(i);
            }
            C32128CjE c32128CjE3 = C32129CjF.LIZ;
            if ((c32128CjE3.LJIILL || c32128CjE3.LJIJ) && (c32580CqW = c32676Cs4.LJLJJL) != null) {
                if (c32128CjE3.LJIJ) {
                    i2 = c32676Cs4.LLIIIZ;
                } else {
                    i2 = c32676Cs4.LLIIIL;
                }
                AbstractC32579CqV abstractC32579CqV = c32580CqW.LJLILLLLZI.get(Integer.valueOf(i2));
                if (abstractC32579CqV != null) {
                    abstractC32579CqV.LJIIJ();
                }
            }
            BEA.LIZ.getClass();
            BEA.LIZLLL = true;
            c32676Cs4.LLJJJJ = false;
            c32128CjE3.LJIILLIIL = false;
            C31563Ca7 c31563Ca7 = c32676Cs4.LLJLLIL;
            if (c31563Ca7 != null) {
                c31563Ca7.LJLJJI.LIZIZ(0L);
                c31563Ca7.LJLILLLLZI.setVisibility(0);
                c31563Ca7.LJLLILLLL.setVisibility(4);
                c31563Ca7.LJLLI.setVisibility(8);
                c31563Ca7.LJLJLLL.setVisibility(8);
                c31563Ca7.LJLL.setVisibility(8);
                c31563Ca7.LLII = false;
                c31563Ca7.LLIIII = false;
                c31563Ca7.LLIIIILZ = false;
                c31563Ca7.LLIFFJFJJ = false;
                c31563Ca7.LLIIIL = false;
                C73411SrX c73411SrX = c31563Ca7.LLFFF;
                if (c73411SrX != null) {
                    c73411SrX.dispose();
                }
                C73411SrX c73411SrX2 = c31563Ca7.LLFII;
                if (c73411SrX2 != null) {
                    c73411SrX2.dispose();
                }
            }
            GiftLeafRootViewModel LJJIJLIJ4 = c32676Cs4.LJJIJLIJ();
            if (LJJIJLIJ4 != null && (dataChannel = LJJIJLIJ4.LJLIL) != null) {
                dataChannel.qv0(GiftLimitNotificationEvent.class, Boolean.valueOf(BEA.LIZJ()));
            }
            BagListViewModel LJJIJ7 = c32676Cs4.LJJIJ();
            if (LJJIJ7 != null && (mutableLiveData3 = LJJIJ7.LJLJL) != null) {
                mutableLiveData3.setValue(Boolean.FALSE);
            }
            if (C32696CsO.LIZIZ) {
                C32696CsO.LIZIZ = false;
            }
            C32696CsO.LIZJ = false;
            c32676Cs4.LLIIZ = false;
            return;
        }
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList3 = null;
        C32676Cs4 c32676Cs42 = this.LIZ;
        c32676Cs42.LLIIJLIL = true;
        c32676Cs42.LLIIL = true;
        C32785Ctp c32785Ctp2 = C32785Ctp.LJIILIIL;
        c32785Ctp2.LJIIL = true;
        c32676Cs42.LLIZ = true;
        C32694CsM.LJIIJJI = true;
        C32694CsM.LJII = SystemClock.uptimeMillis();
        if (!c32676Cs42.LLJJ) {
            c32676Cs42.LLJJIJI = SystemClock.uptimeMillis();
            c32676Cs42.LLJJIJIIJIL = 0L;
            c32676Cs42.LLJJIII = true;
            RunnableC31065CHd runnableC31065CHd3 = c32676Cs42.LJLZ;
            if (runnableC31065CHd3 != null && (viewTreeObserver4 = runnableC31065CHd3.getViewTreeObserver()) != null) {
                viewTreeObserver4.removeOnGlobalLayoutListener(c32676Cs42.LLJLILLLLZIIL);
            }
            RunnableC31065CHd runnableC31065CHd4 = c32676Cs42.LJLZ;
            if (runnableC31065CHd4 != null && (viewTreeObserver3 = runnableC31065CHd4.getViewTreeObserver()) != null) {
                viewTreeObserver3.addOnGlobalLayoutListener(c32676Cs42.LLJLILLLLZIIL);
            }
        } else {
            RunnableC31065CHd runnableC31065CHd5 = c32676Cs42.LJLZ;
            if (runnableC31065CHd5 != null && (viewTreeObserver2 = runnableC31065CHd5.getViewTreeObserver()) != null) {
                viewTreeObserver2.removeOnPreDrawListener(c32676Cs42.LLJLIL);
            }
            RunnableC31065CHd runnableC31065CHd6 = c32676Cs42.LJLZ;
            if (runnableC31065CHd6 != null && (viewTreeObserver = runnableC31065CHd6.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnPreDrawListener(c32676Cs42.LLJLIL);
            }
        }
        c32676Cs42.LLJJLIIIJLLLLLLLZ.set(true);
        DialogC38611fN dialogC38611fN3 = c32676Cs42.LJLJLLL;
        if (dialogC38611fN3 != null) {
            C16880lQ.LIZ(dialogC38611fN3);
        }
        C88137YiT.LIZ.LIZ = true;
        C78076Uka c78076Uka = C78110Ul8.LIZ;
        GiftPanelLeafViewModel LJJIJIL5 = c32676Cs42.LJJIJIL();
        if (LJJIJIL5 != null && (mutableLiveData = LJJIJIL5.LJLILLLLZI) != null) {
            linkedList3 = mutableLiveData.getValue();
        }
        c78076Uka.getClass();
        if (linkedList3 == null) {
            new LinkedList();
        }
        C32781Ctl.LIZ.LIZLLL();
        c32676Cs42.LJJLIIIJLJLI();
        C29306Beo.LJJJJJL(C15380j0.LIZ(0.0f), c32676Cs42.LLILZLL);
        C31563Ca7 c31563Ca72 = c32676Cs42.LLJLLIL;
        if (c31563Ca72 != null) {
            c31563Ca72.setVisibility(8);
        }
        C31563Ca7 c31563Ca73 = c32676Cs42.LLJLLIL;
        if (c31563Ca73 != null) {
            C31563Ca7.LJJZZIII(false);
            c31563Ca73.LLII = false;
        }
        BEA.LIZ.getClass();
        BEA.LIZLLL = false;
        C32129CjF.LIZ.LJIILLIIL = true;
        c32676Cs42.LLJJJJLIIL = false;
        c32676Cs42.LLJJJJJIL = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).jj0();
        c32785Ctp2.LJIIIIZZ.clear();
        C31563Ca7 c31563Ca74 = c32676Cs42.LLJLLIL;
        if (c31563Ca74 == null) {
            return;
        }
        c31563Ca74.LJLIIIL(((IUserLevelService) CN1.LIZ(IUserLevelService.class)).gr());
    }
}
