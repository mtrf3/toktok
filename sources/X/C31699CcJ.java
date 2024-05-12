package X;

import Y.ALAdapterS4S0100000_5;
import Y.AObserverS66S0300000_5;
import Y.AObserverS69S0200000_5;
import Y.ARunnableS24S0200000_5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.toolbar.TBViewModel;
import com.bytedance.android.livesdk.dataChannel.CommentCompressOnSmallEvent;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNewMessageVisible;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentWidthOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CcJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31699CcJ implements InterfaceC30264BuG, InterfaceC31718Ccc {
    public Context LJLIL;
    public LifecycleOwner LJLILLLLZI;
    public DataChannel LJLJI;
    public InterfaceC30269BuL LJLJJI;
    public boolean LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public FrameLayout LJLL;
    public ImageView LJLLI;
    public C29701Eo LJLLILLLL;
    public C47121t6 LJLLJ;
    public View LJLLL;
    public ImageView LJLLLL;
    public TextView LJLLLLLL;
    public InterfaceC31710CcU<?, ?, ?> LJLZ;
    public InterfaceC31095CIh LJZ;
    public IIconSlot.SlotViewModel LJZI;
    public EnumC31700CcK LLD;
    public C72400SbE LLF;
    public ViewGroup.LayoutParams LLFF;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 68));
    public long LJLJJLL = -1;
    public final Queue<C31723Cch> LJZL = new PriorityBlockingQueue(3, C31702CcM.LJLIL);
    public final java.util.Map<C31723Cch, IIconSlot.SlotViewModel> LL = new LinkedHashMap();
    public final List<C31698CcI> LLFFF = new ArrayList();
    public final ALAdapterS4S0100000_5 LLFII = new ALAdapterS4S0100000_5(this, 21);

    @Override // X.InterfaceC30264BuG
    public final long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceC30264BuG
    public final boolean LLLILZJ(View view) {
        return false;
    }

    public final void LIZJ() {
        View view = this.LJLLL;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.LJLLLL;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView = this.LJLLLLLL;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // X.InterfaceC31718Ccc
    public final void LJJII(EnumC31700CcK enumC31700CcK) {
        this.LLD = enumC31700CcK;
    }

    @Override // X.InterfaceC30264BuG
    public final void onClick(View view) {
        Object obj;
        IIconSlot iIconSlot;
        InterfaceC31710CcU<?, ?, ?> interfaceC31710CcU = this.LJLZ;
        View view2 = null;
        if (interfaceC31710CcU != null) {
            obj = interfaceC31710CcU.LLJJJIL();
        } else {
            obj = null;
        }
        if ((obj instanceof IIconSlot) && (iIconSlot = (IIconSlot) obj) != null) {
            InterfaceC31687Cc7 LIZ = iIconSlot.LIZ();
            if (LIZ != null) {
                InterfaceC30269BuL interfaceC30269BuL = this.LJLJJI;
                if (interfaceC30269BuL != null) {
                    view2 = interfaceC30269BuL.LJFF();
                }
                LIZ.LIZ(view2, "during_live");
            } else {
                iIconSlot.getScheme();
                if (!TextUtils.isEmpty(null)) {
                    IActionHandlerService iActionHandlerService = (IActionHandlerService) CN1.LIZ(IActionHandlerService.class);
                    Context context = this.LJLIL;
                    iIconSlot.getScheme();
                    iActionHandlerService.handleWithoutHost(context, UriProtector.parse(null).toString());
                }
            }
            C31684Cc4.LJ(this.LJLZ);
        }
    }

    @Override // X.InterfaceC30264BuG
    public final void LIZ(C30252Bu4 toolbarContext, C30158BsY c30158BsY) {
        o.LJIIIZ(toolbarContext, "toolbarContext");
        this.LJLIL = toolbarContext.LIZ;
        this.LJLILLLLZI = toolbarContext.LIZIZ;
        this.LJLJI = toolbarContext.LIZJ;
        this.LJLJJI = c30158BsY;
        this.LJLJJLL = SystemClock.uptimeMillis();
        this.LJLL = (FrameLayout) c30158BsY.LIZ(R.id.ldh);
        this.LJLLI = (ImageView) c30158BsY.LIZ(R.id.ldg);
        this.LJLLILLLL = (C29701Eo) c30158BsY.LIZ(R.id.ld9);
        this.LJLLJ = (C47121t6) c30158BsY.LIZ(R.id.ldm);
        this.LJLLL = c30158BsY.LIZ(R.id.ldb);
        this.LJLLLL = (ImageView) c30158BsY.LIZ(R.id.ld6);
        this.LJLLLLLL = (TextView) c30158BsY.LIZ(R.id.ld8);
        LIZLLL(null, false);
        if (LiveCommentWidthOptSetting.INSTANCE.isStrategyEnable()) {
            FrameLayout frameLayout = this.LJLL;
            if (frameLayout != null) {
                frameLayout.post(new ARunnableS24S0200000_5(this, frameLayout, 10));
            }
            DataChannel dataChannel = this.LJLJI;
            if (dataChannel != null) {
                LifecycleOwner lifecycleOwner = this.LJLILLLLZI;
                if (lifecycleOwner != null) {
                    dataChannel.ov0(lifecycleOwner, CommentCompressOnSmallEvent.class, new AqS171S0100000_5(this, 97));
                } else {
                    o.LJIJI("lifecycleOwner");
                    throw null;
                }
            } else {
                o.LJIJI("dataChannel");
                throw null;
            }
        }
        ISlotService iSlotService = (ISlotService) CN1.LIZ(ISlotService.class);
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(this.LJLIL);
        EnumC30736C4m enumC30736C4m = EnumC30736C4m.SLOT_LIVE_WATCHER_TOOLBAR;
        InterfaceC31095CIh createIconSlotController = iSlotService.createIconSlotController(LIZIZ, this, enumC30736C4m, EnumC31700CcK.PRIORITY);
        this.LJZ = createIconSlotController;
        if (createIconSlotController != null) {
            DataChannel dataChannel2 = this.LJLJI;
            if (dataChannel2 != null) {
                createIconSlotController.setDataChannel(dataChannel2);
                createIconSlotController.load(C29306Beo.LIZIZ(this.LJLIL), enumC30736C4m);
                LifecycleOwner lifecycleOwner2 = this.LJLILLLLZI;
                if (lifecycleOwner2 != null) {
                    lifecycleOwner2.getLifecycle().addObserver(createIconSlotController);
                } else {
                    o.LJIJI("lifecycleOwner");
                    throw null;
                }
            } else {
                o.LJIJI("dataChannel");
                throw null;
            }
        }
        DataChannel dataChannel3 = this.LJLJI;
        if (dataChannel3 != null) {
            LifecycleOwner lifecycleOwner3 = this.LJLILLLLZI;
            if (lifecycleOwner3 != null) {
                dataChannel3.lv0(lifecycleOwner3, PublicScreenNewMessageVisible.class, new AqS171S0100000_5(this, 98));
                return;
            } else {
                o.LJIJI("lifecycleOwner");
                throw null;
            }
        }
        o.LJIJI("dataChannel");
        throw null;
    }

    @Override // X.InterfaceC30264BuG
    public final void LIZIZ(C30252Bu4 toolbarContext, InterfaceC30269BuL interfaceC30269BuL) {
        XKQ xkq;
        o.LJIIIZ(toolbarContext, "toolbarContext");
        IIconSlot.SlotViewModel slotViewModel = this.LJZI;
        if (slotViewModel != null) {
            LifecycleOwner lifecycleOwner = this.LJLILLLLZI;
            if (lifecycleOwner != null) {
                slotViewModel.gv0(lifecycleOwner);
            } else {
                o.LJIJI("lifecycleOwner");
                throw null;
            }
        }
        ((PriorityBlockingQueue) this.LJZL).clear();
        for (IIconSlot.SlotViewModel slotViewModel2 : ((LinkedHashMap) this.LL).values()) {
            LifecycleOwner lifecycleOwner2 = this.LJLILLLLZI;
            if (lifecycleOwner2 != null) {
                slotViewModel2.gv0(lifecycleOwner2);
            } else {
                o.LJIJI("lifecycleOwner");
                throw null;
            }
        }
        ((LinkedHashMap) this.LL).clear();
        C72400SbE c72400SbE = this.LLF;
        if (c72400SbE != null && (xkq = c72400SbE.LIZIZ) != null) {
            xkq.LIZIZ(null);
        }
        InterfaceC31095CIh interfaceC31095CIh = this.LJZ;
        if (interfaceC31095CIh != null) {
            interfaceC31095CIh.onDestroy();
            LifecycleOwner lifecycleOwner3 = this.LJLILLLLZI;
            if (lifecycleOwner3 != null) {
                lifecycleOwner3.getLifecycle().removeObserver(interfaceC31095CIh);
            } else {
                o.LJIJI("lifecycleOwner");
                throw null;
            }
        }
    }

    public final void LIZLLL(InterfaceC31710CcU<?, ?, ?> interfaceC31710CcU, boolean z) {
        java.util.Map<String, Object> dataContainer;
        if (z) {
            EnumC30241Btt enumC30241Btt = EnumC30241Btt.ICON_SLOT;
            DataChannel dataChannel = this.LJLJI;
            if (dataChannel != null) {
                TBViewModel viewModel = enumC30241Btt.getViewModel(dataChannel);
                if (viewModel != null) {
                    viewModel.hv0(true, true);
                }
                HashMap hashMap = new HashMap();
                if (!this.LJLJL) {
                    InterfaceC31095CIh interfaceC31095CIh = this.LJZ;
                    if (interfaceC31095CIh != null && (dataContainer = interfaceC31095CIh.getDataContainer()) != null) {
                        C31688Cc8.LIZ(this.LJLJJLL, hashMap, dataContainer);
                    }
                    C31684Cc4.LJFF(interfaceC31710CcU, hashMap);
                }
                this.LJLJL = true;
                return;
            }
            o.LJIJI("dataChannel");
            throw null;
        }
        EnumC30241Btt enumC30241Btt2 = EnumC30241Btt.ICON_SLOT;
        DataChannel dataChannel2 = this.LJLJI;
        if (dataChannel2 != null) {
            TBViewModel viewModel2 = enumC30241Btt2.getViewModel(dataChannel2);
            if (viewModel2 == null) {
                return;
            }
            viewModel2.hv0(false, true);
            return;
        }
        o.LJIJI("dataChannel");
        throw null;
    }

    public final void LJ(InterfaceC31710CcU<?, ?, ?> interfaceC31710CcU, IIconSlot.SlotViewModel slotViewModel) {
        this.LJLZ = interfaceC31710CcU;
        MutableLiveData<Boolean> mutableLiveData = slotViewModel.LJLJJL;
        LifecycleOwner lifecycleOwner = this.LJLILLLLZI;
        if (lifecycleOwner != null) {
            mutableLiveData.observe(lifecycleOwner, new AObserverS69S0200000_5(slotViewModel, this, 9));
            MutableLiveData<Drawable> mutableLiveData2 = slotViewModel.LJLL;
            LifecycleOwner lifecycleOwner2 = this.LJLILLLLZI;
            if (lifecycleOwner2 != null) {
                mutableLiveData2.observe(lifecycleOwner2, new AObserverS69S0200000_5(slotViewModel, this, 10));
                MutableLiveData<String> mutableLiveData3 = slotViewModel.LJLJJI;
                LifecycleOwner lifecycleOwner3 = this.LJLILLLLZI;
                if (lifecycleOwner3 != null) {
                    mutableLiveData3.observe(lifecycleOwner3, new AObserverS69S0200000_5(slotViewModel, this, 11));
                    MutableLiveData<Drawable> mutableLiveData4 = slotViewModel.LJLJL;
                    LifecycleOwner lifecycleOwner4 = this.LJLILLLLZI;
                    if (lifecycleOwner4 != null) {
                        mutableLiveData4.observe(lifecycleOwner4, new AObserverS69S0200000_5(slotViewModel, this, 12));
                        MutableLiveData<Drawable> mutableLiveData5 = slotViewModel.LJLJLJ;
                        LifecycleOwner lifecycleOwner5 = this.LJLILLLLZI;
                        if (lifecycleOwner5 != null) {
                            mutableLiveData5.observe(lifecycleOwner5, new AObserverS69S0200000_5(slotViewModel, this, 13));
                            MutableLiveData<Boolean> mutableLiveData6 = slotViewModel.LJLLLL;
                            LifecycleOwner lifecycleOwner6 = this.LJLILLLLZI;
                            if (lifecycleOwner6 != null) {
                                mutableLiveData6.observe(lifecycleOwner6, new AObserverS66S0300000_5(slotViewModel, (IIconSlot.SlotViewModel) interfaceC31710CcU, (InterfaceC31710CcU<?, ?, ?>) this, (C31699CcJ) 9));
                                if (((Boolean) this.LJLJJL.getValue()).booleanValue()) {
                                    MutableLiveData<String> mutableLiveData7 = slotViewModel.LJLLI;
                                    LifecycleOwner lifecycleOwner7 = this.LJLILLLLZI;
                                    if (lifecycleOwner7 != null) {
                                        mutableLiveData7.observe(lifecycleOwner7, new AObserverS69S0200000_5(slotViewModel, this, 14));
                                    } else {
                                        o.LJIJI("lifecycleOwner");
                                        throw null;
                                    }
                                }
                                MutableLiveData<C31697CcH> mutableLiveData8 = slotViewModel.LJLLL;
                                LifecycleOwner lifecycleOwner8 = this.LJLILLLLZI;
                                if (lifecycleOwner8 != null) {
                                    mutableLiveData8.observe(lifecycleOwner8, new AObserverS69S0200000_5(slotViewModel, this, 15));
                                    return;
                                } else {
                                    o.LJIJI("lifecycleOwner");
                                    throw null;
                                }
                            }
                            o.LJIJI("lifecycleOwner");
                            throw null;
                        }
                        o.LJIJI("lifecycleOwner");
                        throw null;
                    }
                    o.LJIJI("lifecycleOwner");
                    throw null;
                }
                o.LJIJI("lifecycleOwner");
                throw null;
            }
            o.LJIJI("lifecycleOwner");
            throw null;
        }
        o.LJIJI("lifecycleOwner");
        throw null;
    }

    @Override // X.InterfaceC31718Ccc
    public final void LJLLL(InterfaceC31710CcU<?, ?, ?> interfaceC31710CcU, IIconSlot.SlotViewModel slotViewModel) {
        this.LJZI = slotViewModel;
        if (slotViewModel == null) {
            return;
        }
        slotViewModel.LJLIL.postValue(Boolean.TRUE);
        MutableLiveData<Boolean> mutableLiveData = slotViewModel.LJLILLLLZI;
        LifecycleOwner lifecycleOwner = this.LJLILLLLZI;
        if (lifecycleOwner != null) {
            mutableLiveData.observe(lifecycleOwner, new AObserverS66S0300000_5(slotViewModel, (IIconSlot.SlotViewModel) interfaceC31710CcU, (InterfaceC31710CcU<?, ?, ?>) this, (C31699CcJ) 5));
            if (interfaceC31710CcU != null) {
                LJ(interfaceC31710CcU, slotViewModel);
                return;
            }
            return;
        }
        o.LJIJI("lifecycleOwner");
        throw null;
    }

    @Override // X.InterfaceC31718Ccc
    public final void LJLLLL(C31723Cch c31723Cch, IIconSlot.SlotViewModel slotViewModel) {
        if (c31723Cch == null || slotViewModel == null) {
            return;
        }
        ((PriorityBlockingQueue) this.LJZL).add(c31723Cch);
        this.LL.put(c31723Cch, slotViewModel);
        EnumC31700CcK enumC31700CcK = this.LLD;
        if (enumC31700CcK == EnumC31700CcK.FIRST) {
            MutableLiveData<Boolean> mutableLiveData = slotViewModel.LJLILLLLZI;
            LifecycleOwner lifecycleOwner = this.LJLILLLLZI;
            if (lifecycleOwner != null) {
                mutableLiveData.observe(lifecycleOwner, new AObserverS66S0300000_5(c31723Cch, this, slotViewModel, 6));
                return;
            } else {
                o.LJIJI("lifecycleOwner");
                throw null;
            }
        }
        if (enumC31700CcK == EnumC31700CcK.LAST) {
            MutableLiveData<Boolean> mutableLiveData2 = slotViewModel.LJLILLLLZI;
            LifecycleOwner lifecycleOwner2 = this.LJLILLLLZI;
            if (lifecycleOwner2 != null) {
                mutableLiveData2.observe(lifecycleOwner2, new AObserverS66S0300000_5(c31723Cch, this, slotViewModel, 7));
                return;
            } else {
                o.LJIJI("lifecycleOwner");
                throw null;
            }
        }
        if (enumC31700CcK != EnumC31700CcK.PRIORITY) {
            return;
        }
        MutableLiveData<Boolean> mutableLiveData3 = slotViewModel.LJLILLLLZI;
        LifecycleOwner lifecycleOwner3 = this.LJLILLLLZI;
        if (lifecycleOwner3 != null) {
            mutableLiveData3.observe(lifecycleOwner3, new AObserverS66S0300000_5(c31723Cch, this, slotViewModel, 8));
        } else {
            o.LJIJI("lifecycleOwner");
            throw null;
        }
    }
}
