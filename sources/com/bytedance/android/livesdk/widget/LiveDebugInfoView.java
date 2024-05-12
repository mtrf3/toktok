package com.bytedance.android.livesdk.widget;

import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C1EW;
import X.C252609vk;
import X.C28154B3e;
import X.C28392BCi;
import X.C30868C9o;
import X.C41071jL;
import X.C5H3;
import X.C67981Qm9;
import X.C78857UxB;
import X.C78862UxG;
import X.C78996UzQ;
import X.CN1;
import X.HandlerC28345BAn;
import X.InterfaceC06390Mx;
import X.InterfaceC28344BAm;
import X.InterfaceC28738BPq;
import X.OHS;
import X.Q7L;
import X.X1D;
import Y.AfS36S0101000_5;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.debug.DebugRoomItem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class LiveDebugInfoView extends LiveRecyclableWidget implements View.OnClickListener, InterfaceC28344BAm, View.OnLongClickListener {
    public String LJLIL = "";
    public final int LJLILLLLZI = 18;
    public final long LJLJI = 5000;
    public final String LJLJJI = "LiveDebugInfoView";
    public List<DebugRoomItem> LJLJJL = new ArrayList();
    public final List<DebugRoomItem> LJLJJLL = new ArrayList();
    public final C5H3 LJLJL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 274));
    public TextView LJLJLJ;
    public TextView LJLJLLL;
    public TextView LJLL;
    public TextView LJLLI;
    public TextView LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;
    public View LJLLLL;
    public View LJLLLLLL;
    public C41071jL LJLZ;
    public LinearLayout LJZ;
    public LinearLayout LJZI;
    public LinearLayout LJZL;
    public LinearLayout LL;
    public LinearLayout LLD;
    public Room LLF;
    public int LLFF;
    public int LLFFF;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.ddr;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public static String LJZ() {
        JSONObject jSONObject;
        String str;
        InterfaceC28738BPq interfaceC28738BPq = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ;
        if (interfaceC28738BPq != null) {
            jSONObject = interfaceC28738BPq.LIZIZ();
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return "";
        }
        int optInt = jSONObject.optInt("push_client_is_hardware_encode:", -1);
        String str2 = "+hw";
        if (optInt == 0) {
            str = "+sw";
        } else if (optInt != 1) {
            str = "";
        } else {
            str = "+hw";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Host：\nResolution：");
        LIZ.append(jSONObject.optString("push_client_resolution:", ""));
        LIZ.append("\r\nCodec：");
        LIZ.append(jSONObject.optString("push_client_codec_type:", ""));
        LIZ.append(str);
        LIZ.append("\r\nFrame rate：");
        LIZ.append(jSONObject.optInt("push_client_fps:", -1));
        LIZ.append("fps\r\nBitrate：");
        LIZ.append(jSONObject.optInt("push_client_bitrate:", -1));
        LIZ.append("kb/s\r\n\n");
        String LIZIZ = X1D.LIZIZ(LIZ);
        Object opt = jSONObject.opt("HardDecode:");
        if (opt == null || !(opt instanceof Boolean)) {
            str2 = "";
        } else if (!o.LJ(opt, Boolean.TRUE)) {
            str2 = "+sw";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("User：\nResolution：");
        LIZ2.append(jSONObject.optInt("width:", -1));
        LIZ2.append('*');
        LIZ2.append(jSONObject.optInt("height:", -1));
        LIZ2.append("\r\nCodec：");
        LIZ2.append(jSONObject.optString("Codec_Type:", ""));
        LIZ2.append(str2);
        LIZ2.append("\r\nFrame rate：");
        LIZ2.append(jSONObject.optInt("render_fps:", -1));
        LIZ2.append("fps\r\nBitrate：");
        LIZ2.append(jSONObject.optLong("download_Speed:", -1L));
        LIZ2.append("kb/s\r\nPlayer status：");
        LIZ2.append(jSONObject.optString("player_state:"));
        LIZ2.append("\r\nPlayer error code：");
        LIZ2.append(jSONObject.optString("Error_Code:"));
        LIZ2.append("\r\n\n");
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Others：\nStream protocol：");
        LIZ3.append(jSONObject.optString("play_format:", ""));
        LIZ3.append("\nTransport protocol：");
        LIZ3.append(jSONObject.optString("play_protocol:", ""));
        LIZ3.append("\nPush client：");
        LIZ3.append(jSONObject.optString("sei_source:", ""));
        LIZ3.append("\r\nDownload speed：");
        LIZ3.append(jSONObject.optString("download_Speed:", ""));
        LIZ3.append("kb/s\r\nBuffer health：");
        LIZ3.append(jSONObject.optLong("audio_Buffer_Time:", -1L));
        LIZ3.append("ms\r\nLatency：");
        LIZ3.append(jSONObject.optLong("delay:", -1L));
        LIZ3.append("ms\r\nSuper resolution：");
        LIZ3.append(jSONObject.optString("sr_type:", ""));
        LIZ3.append("\r\nTemplate：");
        LIZ3.append(jSONObject.optString("resolution:", ""));
        LIZ3.append("\r\nDomain：");
        LIZ3.append(jSONObject.optString("domain:", ""));
        LIZ3.append("\r\nPull Stream URL：");
        LIZ3.append(jSONObject.optString("url:", ""));
        return a1.LJ(LIZIZ, LIZIZ2, X1D.LIZIZ(LIZ3));
    }

    public final HandlerC28345BAn LJLZ() {
        return (HandlerC28345BAn) this.LJLJL.getValue();
    }

    public final void LJZI() {
        TextView textView = this.LJLJLJ;
        if (textView != null) {
            textView.setText(C15380j0.LJIILJJIL(R.string.kqi));
            TextView textView2 = this.LJLLILLLL;
            if (textView2 != null) {
                textView2.setText("");
                if (!this.LJLJJLL.isEmpty()) {
                    DebugRoomItem debugRoomItem = (DebugRoomItem) ListProtector.get(this.LJLJJLL, 0);
                    if (!TextUtils.isEmpty(debugRoomItem.getTabContent())) {
                        TextView textView3 = this.LJLLILLLL;
                        if (textView3 != null) {
                            C67981Qm9.LIZIZ(new Object[]{debugRoomItem.getTabContent(), C15380j0.LJIILJJIL(R.string.kqk), this.LJLIL}, 3, "%s%s %s", "format(format, *args)", textView3);
                        } else {
                            o.LJIJI("mTextViewContent");
                            throw null;
                        }
                    }
                    TextView textView4 = this.LJLJLJ;
                    if (textView4 != null) {
                        textView4.setText(debugRoomItem.getTabTitle());
                        return;
                    } else {
                        o.LJIJI("mTextViewBasic");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("mTextViewContent");
            throw null;
        }
        o.LJIJI("mTextViewBasic");
        throw null;
    }

    public final void LJZL() {
        C41071jL c41071jL = this.LJLZ;
        if (c41071jL != null) {
            c41071jL.setChecked(C28154B3e.LIZIZ);
            LinearLayout linearLayout = this.LJZ;
            if (linearLayout != null) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (C28154B3e.LIZIZ) {
                    LinearLayout linearLayout2 = this.LJZ;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                    } else {
                        o.LJIJI("mLinearContainer");
                        throw null;
                    }
                } else {
                    layoutParams.width = 0;
                    layoutParams.height = 0;
                }
                LinearLayout linearLayout3 = this.LJZ;
                if (linearLayout3 != null) {
                    linearLayout3.setLayoutParams(layoutParams);
                    return;
                } else {
                    o.LJIJI("mLinearContainer");
                    throw null;
                }
            }
            o.LJIJI("mLinearContainer");
            throw null;
        }
        o.LJIJI("mSwitchView");
        throw null;
    }

    public final void LL() {
        TextView textView = this.LJLLI;
        if (textView != null) {
            textView.setText(C15380j0.LJIILJJIL(R.string.kqn));
            if ((!this.LJLJJLL.isEmpty()) && ((ArrayList) this.LJLJJLL).size() > 3) {
                DebugRoomItem debugRoomItem = (DebugRoomItem) ListProtector.get(this.LJLJJLL, 3);
                TextView textView2 = this.LJLLILLLL;
                if (textView2 != null) {
                    textView2.setText(debugRoomItem.getTabContent());
                    TextView textView3 = this.LJLLI;
                    if (textView3 != null) {
                        textView3.setText(debugRoomItem.getTabTitle());
                        return;
                    } else {
                        o.LJIJI("mTextViewLinkMic");
                        throw null;
                    }
                }
                o.LJIJI("mTextViewContent");
                throw null;
            }
            return;
        }
        o.LJIJI("mTextViewLinkMic");
        throw null;
    }

    public final void LLF() {
        TextView textView = this.LJLJLLL;
        if (textView != null) {
            textView.setText(C15380j0.LJIILJJIL(R.string.kqo));
            TextView textView2 = this.LJLLILLLL;
            if (textView2 != null) {
                textView2.setText("");
                if ((!((ArrayList) this.LJLJJLL).isEmpty()) && ((ArrayList) this.LJLJJLL).size() > 1) {
                    DebugRoomItem debugRoomItem = (DebugRoomItem) ListProtector.get(this.LJLJJLL, 1);
                    TextView textView3 = this.LJLLILLLL;
                    if (textView3 != null) {
                        textView3.setText(debugRoomItem.getTabContent());
                        TextView textView4 = this.LJLJLLL;
                        if (textView4 != null) {
                            textView4.setText(debugRoomItem.getTabTitle());
                            return;
                        } else {
                            o.LJIJI("mTextViewPerformance");
                            throw null;
                        }
                    }
                    o.LJIJI("mTextViewContent");
                    throw null;
                }
                TextView textView5 = this.LJLLILLLL;
                if (textView5 != null) {
                    textView5.setText(LJZ());
                    return;
                } else {
                    o.LJIJI("mTextViewContent");
                    throw null;
                }
            }
            o.LJIJI("mTextViewContent");
            throw null;
        }
        o.LJIJI("mTextViewPerformance");
        throw null;
    }

    public final void LLFF() {
        TextView textView = this.LJLL;
        if (textView != null) {
            textView.setText(C15380j0.LJIILJJIL(R.string.kqp));
            TextView textView2 = this.LJLLILLLL;
            if (textView2 != null) {
                textView2.setText("");
                if ((!this.LJLJJLL.isEmpty()) && ((ArrayList) this.LJLJJLL).size() > 2) {
                    DebugRoomItem debugRoomItem = (DebugRoomItem) ListProtector.get(this.LJLJJLL, 2);
                    TextView textView3 = this.LJLLILLLL;
                    if (textView3 != null) {
                        textView3.setText(debugRoomItem.getTabContent());
                        TextView textView4 = this.LJLL;
                        if (textView4 != null) {
                            textView4.setText(debugRoomItem.getTabTitle());
                            return;
                        } else {
                            o.LJIJI("mTextViewRecommend");
                            throw null;
                        }
                    }
                    o.LJIJI("mTextViewContent");
                    throw null;
                }
                return;
            }
            o.LJIJI("mTextViewContent");
            throw null;
        }
        o.LJIJI("mTextViewRecommend");
        throw null;
    }

    public final void LLFFF() {
        TextView textView = this.LJLJLJ;
        if (textView != null) {
            textView.setSelected(false);
            TextView textView2 = this.LJLJLLL;
            if (textView2 != null) {
                textView2.setSelected(false);
                TextView textView3 = this.LJLL;
                if (textView3 != null) {
                    textView3.setSelected(false);
                    TextView textView4 = this.LJLLI;
                    if (textView4 != null) {
                        textView4.setSelected(false);
                        View view = this.LJLLJ;
                        if (view != null) {
                            view.setVisibility(8);
                            View view2 = this.LJLLL;
                            if (view2 != null) {
                                view2.setVisibility(8);
                                View view3 = this.LJLLLL;
                                if (view3 != null) {
                                    view3.setVisibility(8);
                                    View view4 = this.LJLLLLLL;
                                    if (view4 != null) {
                                        view4.setVisibility(8);
                                        int i = this.LLFF;
                                        if (i != 1) {
                                            if (i != 2) {
                                                if (i != 3) {
                                                    TextView textView5 = this.LJLJLJ;
                                                    if (textView5 != null) {
                                                        textView5.setSelected(true);
                                                        View view5 = this.LJLLJ;
                                                        if (view5 != null) {
                                                            view5.setVisibility(0);
                                                            return;
                                                        } else {
                                                            o.LJIJI("mLineBasic");
                                                            throw null;
                                                        }
                                                    }
                                                    o.LJIJI("mTextViewBasic");
                                                    throw null;
                                                }
                                                TextView textView6 = this.LJLLI;
                                                if (textView6 != null) {
                                                    textView6.setSelected(true);
                                                    View view6 = this.LJLLLLLL;
                                                    if (view6 != null) {
                                                        view6.setVisibility(0);
                                                        return;
                                                    } else {
                                                        o.LJIJI("mLineLinkMic");
                                                        throw null;
                                                    }
                                                }
                                                o.LJIJI("mTextViewLinkMic");
                                                throw null;
                                            }
                                            TextView textView7 = this.LJLL;
                                            if (textView7 != null) {
                                                textView7.setSelected(true);
                                                View view7 = this.LJLLLL;
                                                if (view7 != null) {
                                                    view7.setVisibility(0);
                                                    return;
                                                } else {
                                                    o.LJIJI("mLineRecommend");
                                                    throw null;
                                                }
                                            }
                                            o.LJIJI("mTextViewRecommend");
                                            throw null;
                                        }
                                        TextView textView8 = this.LJLJLLL;
                                        if (textView8 != null) {
                                            textView8.setSelected(true);
                                            View view8 = this.LJLLL;
                                            if (view8 != null) {
                                                view8.setVisibility(0);
                                                return;
                                            } else {
                                                o.LJIJI("mLinePerformance");
                                                throw null;
                                            }
                                        }
                                        o.LJIJI("mTextViewPerformance");
                                        throw null;
                                    }
                                    o.LJIJI("mLineLinkMic");
                                    throw null;
                                }
                                o.LJIJI("mLineRecommend");
                                throw null;
                            }
                            o.LJIJI("mLinePerformance");
                            throw null;
                        }
                        o.LJIJI("mLineBasic");
                        throw null;
                    }
                    o.LJIJI("mTextViewLinkMic");
                    throw null;
                }
                o.LJIJI("mTextViewRecommend");
                throw null;
            }
            o.LJIJI("mTextViewPerformance");
            throw null;
        }
        o.LJIJI("mTextViewBasic");
        throw null;
    }

    public final void LLFII() {
        String str;
        ((ArrayList) this.LJLJJLL).clear();
        String str2 = "";
        if (this.LJLJJL.isEmpty()) {
            DebugRoomItem debugRoomItem = new DebugRoomItem(null, null, 3, null);
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.kqi);
            if (LJIILJJIL == null) {
                LJIILJJIL = "";
            }
            debugRoomItem.setTabTitle(LJIILJJIL);
            debugRoomItem.setTabContent("");
            ((ArrayList) this.LJLJJLL).add(debugRoomItem);
        } else {
            ((ArrayList) this.LJLJJLL).add(ListProtector.get(this.LJLJJL, 0));
        }
        DebugRoomItem debugRoomItem2 = new DebugRoomItem(null, null, 3, null);
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.kqo);
        if (LJIILJJIL2 == null) {
            LJIILJJIL2 = "";
        }
        debugRoomItem2.setTabTitle(LJIILJJIL2);
        debugRoomItem2.setTabContent(LJZ());
        ((ArrayList) this.LJLJJLL).add(debugRoomItem2);
        DebugRoomItem debugRoomItem3 = new DebugRoomItem(null, null, 3, null);
        String LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.kqp);
        if (LJIILJJIL3 == null) {
            LJIILJJIL3 = "";
        }
        debugRoomItem3.setTabTitle(LJIILJJIL3);
        DataChannel provideDataChannel = provideDataChannel();
        if (provideDataChannel == null || (str = (String) provideDataChannel.kv0(C28392BCi.class)) == null) {
            str = "";
        }
        debugRoomItem3.setTabContent(str);
        ((ArrayList) this.LJLJJLL).add(debugRoomItem3);
        if (TextUtils.isEmpty(debugRoomItem3.getTabContent())) {
            TextView textView = this.LJLL;
            if (textView != null) {
                textView.setVisibility(8);
            } else {
                o.LJIJI("mTextViewRecommend");
                throw null;
            }
        } else {
            TextView textView2 = this.LJLL;
            if (textView2 != null) {
                textView2.setVisibility(0);
            } else {
                o.LJIJI("mTextViewRecommend");
                throw null;
            }
        }
        InterfaceC06390Mx LIZ = CN1.LIZ(IInteractService.class);
        o.LJIIIIZZ(LIZ, "getService(IInteractService::class.java)");
        IInteractService iInteractService = (IInteractService) LIZ;
        DebugRoomItem debugRoomItem4 = new DebugRoomItem(null, null, 3, null);
        String LJIILJJIL4 = C15380j0.LJIILJJIL(R.string.kqn);
        if (LJIILJJIL4 != null) {
            str2 = LJIILJJIL4;
        }
        debugRoomItem4.setTabTitle(str2);
        String debugInfo = iInteractService.getDebugInfo();
        o.LJIIIIZZ(debugInfo, "interactService.debugInfo");
        debugRoomItem4.setTabContent(debugInfo);
        ((ArrayList) this.LJLJJLL).add(debugRoomItem4);
        show();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        if (LJLZ() != null) {
            LJLZ().removeCallbacksAndMessages(null);
        }
        C41071jL c41071jL = this.LJLZ;
        if (c41071jL != null) {
            c41071jL.clearAnimation();
        } else {
            o.LJIJI("mSwitchView");
            throw null;
        }
    }

    @Override // X.InterfaceC28344BAm
    public final void handleMsg(Message message) {
        Integer num;
        Object obj;
        if (message != null) {
            num = Integer.valueOf(message.what);
        } else {
            num = null;
        }
        int i = this.LJLILLLLZI;
        if (num == null) {
            return;
        }
        if (num.intValue() == i) {
            if (this.LJLJJL.isEmpty() && this.LLFFF < 2) {
                HandlerC28345BAn LJLZ = LJLZ();
                Room room = this.LLF;
                if (room != null) {
                    C1EW.LIZ(((RoomRetrofitApi) Q7L.LIZIZ(RoomRetrofitApi.class)).getRoomDebugInfo(room.getId())).LJJJLIIL(new AfS36S0101000_5(0, LJLZ, 19), new AfS36S0101000_5(1, LJLZ, 42));
                    this.LLFFF++;
                } else {
                    o.LJIJI("mRoom");
                    throw null;
                }
            }
            LLFII();
            int i2 = this.LLFF;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        LJZI();
                    } else {
                        LL();
                    }
                } else {
                    LLFF();
                }
            } else {
                LLF();
            }
            LJLZ().sendEmptyMessageDelayed(this.LJLILLLLZI, this.LJLJI);
            return;
        }
        if (num.intValue() != 39 || (obj = message.obj) == null || !(obj instanceof ArrayList)) {
            return;
        }
        this.LJLJJL = (ArrayList) obj;
        LLFII();
        int i3 = this.LLFF;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    LJZI();
                    return;
                } else {
                    LL();
                    return;
                }
            }
            LLFF();
            return;
        }
        LLF();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return;
        }
        if (valueOf.intValue() == R.id.kya) {
            this.LLFF = 0;
            LLFFF();
            LJZI();
            return;
        }
        if (valueOf == null) {
            return;
        }
        if (valueOf.intValue() == R.id.kz2) {
            this.LLFF = 1;
            LLFFF();
            LLF();
        } else if (valueOf.intValue() == R.id.kz3) {
            this.LLFF = 2;
            LLFFF();
            LLFF();
        } else if (valueOf.intValue() == R.id.kyx) {
            this.LLFF = 3;
            LLFFF();
            LL();
        } else {
            if (valueOf.intValue() != R.id.c45) {
                return;
            }
            C28154B3e.LIZIZ = !C28154B3e.LIZIZ;
            LJZL();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        View findViewById = findViewById(R.id.mmc);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tv_tab_basic)");
        this.LJLJLJ = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.mmj);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.tv_tab_performance)");
        this.LJLJLLL = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.mmk);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.tv_tab_recommend)");
        this.LJLL = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.mmi);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.tv_tab_linkmic)");
        this.LJLLI = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.m4b);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.tv_debug_info_content)");
        this.LJLLILLLL = (TextView) findViewById5;
        View findViewById6 = findViewById(R.id.fsh);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.linear_debug_info_container)");
        this.LJZ = (LinearLayout) findViewById6;
        View findViewById7 = findViewById(R.id.c45);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.debug_switch_view)");
        this.LJLZ = (C41071jL) findViewById7;
        View findViewById8 = findViewById(R.id.kya);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.tab_basic)");
        this.LJZI = (LinearLayout) findViewById8;
        View findViewById9 = findViewById(R.id.kz2);
        o.LJIIIIZZ(findViewById9, "findViewById(R.id.tab_performance)");
        this.LJZL = (LinearLayout) findViewById9;
        View findViewById10 = findViewById(R.id.kz3);
        o.LJIIIIZZ(findViewById10, "findViewById(R.id.tab_recommend)");
        this.LL = (LinearLayout) findViewById10;
        View findViewById11 = findViewById(R.id.kyx);
        o.LJIIIIZZ(findViewById11, "findViewById(R.id.tab_linkmic)");
        this.LLD = (LinearLayout) findViewById11;
        View findViewById12 = findViewById(R.id.fry);
        o.LJIIIIZZ(findViewById12, "findViewById(R.id.line_basic)");
        this.LJLLJ = findViewById12;
        View findViewById13 = findViewById(R.id.fs6);
        o.LJIIIIZZ(findViewById13, "findViewById(R.id.line_performance)");
        this.LJLLL = findViewById13;
        View findViewById14 = findViewById(R.id.fs8);
        o.LJIIIIZZ(findViewById14, "findViewById(R.id.line_recommend)");
        this.LJLLLL = findViewById14;
        View findViewById15 = findViewById(R.id.fs5);
        o.LJIIIIZZ(findViewById15, "findViewById(R.id.line_linkmic)");
        this.LJLLLLLL = findViewById15;
        LinearLayout linearLayout = this.LJZI;
        if (linearLayout != null) {
            C16880lQ.LJIIZILJ(linearLayout, this);
            LinearLayout linearLayout2 = this.LJZL;
            if (linearLayout2 != null) {
                C16880lQ.LJIIZILJ(linearLayout2, this);
                LinearLayout linearLayout3 = this.LL;
                if (linearLayout3 != null) {
                    C16880lQ.LJIIZILJ(linearLayout3, this);
                    LinearLayout linearLayout4 = this.LLD;
                    if (linearLayout4 != null) {
                        C16880lQ.LJIIZILJ(linearLayout4, this);
                        C41071jL c41071jL = this.LJLZ;
                        if (c41071jL != null) {
                            C16880lQ.LJJIIJZLJL(c41071jL, this);
                            TextView textView = this.LJLLILLLL;
                            if (textView != null) {
                                textView.setOnLongClickListener(this);
                                C41071jL c41071jL2 = this.LJLZ;
                                if (c41071jL2 != null) {
                                    c41071jL2.setVisibility(0);
                                    if (objArr != null && objArr.length != 0) {
                                        Object obj = objArr[0];
                                        if (obj instanceof Room) {
                                            o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                                            if (Room.isValid((Room) obj)) {
                                                Object obj2 = objArr[0];
                                                o.LJII(obj2, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                                                this.LLF = (Room) obj2;
                                            }
                                        }
                                    }
                                    this.LLFFF = 0;
                                    LLFFF();
                                    LJZL();
                                    LJLZ().sendEmptyMessage(this.LJLILLLLZI);
                                    String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(System.currentTimeMillis()));
                                    o.LJIIIIZZ(format, "SimpleDateFormat(\"yyyy-M…:ss\").format(currentTime)");
                                    this.LJLIL = format;
                                    return;
                                }
                                o.LJIJI("mSwitchView");
                                throw null;
                            }
                            o.LJIJI("mTextViewContent");
                            throw null;
                        }
                        o.LJIJI("mSwitchView");
                        throw null;
                    }
                    o.LJIJI("mTabLinkMic");
                    throw null;
                }
                o.LJIJI("mTabRecommend");
                throw null;
            }
            o.LJIJI("mTabPerformance");
            throw null;
        }
        o.LJIJI("mTabBasic");
        throw null;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (!((ArrayList) this.LJLJJLL).isEmpty()) {
            LJLZ().removeMessages(this.LJLILLLLZI);
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(((DebugRoomItem) ListProtector.get(this.LJLJJLL, 0)).getTabTitle());
                LIZ.append('\n');
                LIZ.append(((DebugRoomItem) ListProtector.get(this.LJLJJLL, 0)).getTabContent());
                String LIZIZ = X1D.LIZIZ(LIZ);
                int size = ((ArrayList) this.LJLJJLL).size();
                for (int i = 1; i < size; i++) {
                    if (!TextUtils.isEmpty(((DebugRoomItem) ListProtector.get(this.LJLJJLL, i)).getTabContent())) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(LIZIZ);
                        LIZ2.append("\r\n\n");
                        LIZ2.append(((DebugRoomItem) ListProtector.get(this.LJLJJLL, i)).getTabTitle());
                        LIZ2.append('\n');
                        LIZ2.append(((DebugRoomItem) ListProtector.get(this.LJLJJLL, i)).getTabContent());
                        LIZIZ = X1D.LIZIZ(LIZ2);
                    }
                }
                Object LLILL = C16880lQ.LLILL(getContext(), "clipboard");
                o.LJII(LLILL, "null cannot be cast to non-null type android.content.ClipboardManager");
                ClipData clipData = ClipData.newPlainText(LIZIZ, LIZIZ);
                C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476399119, "bpea-1055");
                OHS ohs = C252609vk.LIZ;
                o.LJIIIIZZ(clipData, "clipData");
                ohs.getClass();
                OHS.LIZIZ((ClipboardManager) LLILL, clipData, LJJIIJ);
                C30868C9o.LJI("copied");
            } catch (Exception e) {
                C0NB.LJI(this.LJLJJI, e);
            }
            LJLZ().sendEmptyMessageDelayed(this.LJLILLLLZI, this.LJLJI);
        }
        return false;
    }
}
