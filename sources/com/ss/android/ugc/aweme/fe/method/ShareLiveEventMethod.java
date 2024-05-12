package com.ss.android.ugc.aweme.fe.method;

import X.C175266uI;
import X.C27740Aue;
import X.C38049EwX;
import X.C62415OeZ;
import X.InterfaceC36488ETs;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LiveEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ShareLiveEventMethod extends BaseCommonJavaMethod {
    public ShareLiveEventMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public ShareLiveEventMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.4aN] */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, final InterfaceC36488ETs interfaceC36488ETs) {
        final JSONObject jSONObject2 = new JSONObject();
        WeakReference<Context> mContextRef = this.mContextRef;
        o.LJIIIIZZ(mContextRef, "mContextRef");
        C38049EwX c38049EwX = this.LJLILLLLZI;
        if (jSONObject == null) {
            jSONObject2.put("code", 0);
            jSONObject2.put("share_code", 0);
            jSONObject2.put("msg", "params invalid");
        } else {
            LiveEvent liveEvent = new LiveEvent();
            liveEvent.setShowsIMForActivity(Boolean.valueOf(jSONObject.optBoolean("showsIMForActivity")));
            liveEvent.setEventID(jSONObject.optString("id"));
            liveEvent.setOrganizer((User) GsonProtectorUtils.fromJson(GsonHolder.LIZJ().LIZ(), jSONObject.optString("organizer"), User.class));
            liveEvent.setTitle(jSONObject.optString("title"));
            liveEvent.setStartTime(jSONObject.optString("start_time"));
            liveEvent.setInternalURL(jSONObject.optString("internalURL"));
            liveEvent.setTrackInfo(jSONObject.optString("track_info"));
            liveEvent.setShareURL(jSONObject.optString("shareURL"));
            liveEvent.setAnchor(jSONObject.optString("isAuthor"));
            liveEvent.setCustomActionItems(C175266uI.LIZ(jSONObject.optJSONArray("customActionItems")));
            Context context = mContextRef.get();
            if (TextUtils.isEmpty(liveEvent.getEventID()) || context == null) {
                jSONObject2.put("code", 0);
                jSONObject2.put("share_code", 0);
                jSONObject2.put("msg", "id or context is null");
            } else {
                ?? r2 = new C62415OeZ() { // from class: X.4aN
                    @Override // X.C62415OeZ, X.InterfaceC62474OfW
                    public final void LJ(Context context2, BaseSharePackage sharePackage) {
                        o.LJIIIZ(sharePackage, "sharePackage");
                        o.LJIIIZ(context2, "context");
                        String string = sharePackage.extras.getString("share_platform");
                        if (string != null) {
                            JSONObject jSONObject3 = jSONObject2;
                            InterfaceC36488ETs interfaceC36488ETs2 = interfaceC36488ETs;
                            jSONObject3.put("code", 1);
                            jSONObject3.put("share_code", 1);
                            jSONObject3.put("button", string);
                            if (interfaceC36488ETs2 != null) {
                                interfaceC36488ETs2.LIZIZ(jSONObject3);
                                if (C76800UCe.LIZ != null) {
                                    return;
                                }
                            }
                        }
                        InterfaceC36488ETs interfaceC36488ETs3 = interfaceC36488ETs;
                        if (interfaceC36488ETs3 != null) {
                            JSONObject jSONObject4 = jSONObject2;
                            jSONObject4.put("code", 0);
                            jSONObject4.put("share_code", 0);
                            jSONObject4.put("button", "cancel");
                            interfaceC36488ETs3.LIZIZ(jSONObject4);
                        }
                    }

                    @Override // X.C62415OeZ, X.InterfaceC62474OfW
                    public final void LIZIZ(Context context2, BaseSharePackage sharePackage, InterfaceC62486Ofi action) {
                        o.LJIIIZ(action, "action");
                        o.LJIIIZ(sharePackage, "sharePackage");
                        o.LJIIIZ(context2, "context");
                        JSONObject jSONObject3 = jSONObject2;
                        jSONObject3.put("code", 1);
                        jSONObject3.put("share_code", 1);
                        jSONObject3.put("button", action.key());
                        InterfaceC36488ETs interfaceC36488ETs2 = interfaceC36488ETs;
                        if (interfaceC36488ETs2 != null) {
                            interfaceC36488ETs2.LIZIZ(jSONObject2);
                        }
                    }

                    @Override // X.C62415OeZ, X.InterfaceC110854Wr
                    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context2) {
                        String str;
                        String str2;
                        String str3;
                        Bundle bundle;
                        Bundle bundle2;
                        Bundle bundle3;
                        Bundle bundle4;
                        Bundle bundle5;
                        o.LJIIIZ(channel, "channel");
                        o.LJIIIZ(context2, "context");
                        if (z) {
                            boolean z2 = false;
                            if (baseSharePackage != null && (bundle5 = baseSharePackage.extras) != null) {
                                z2 = bundle5.getBoolean("is_paid_event", false);
                            }
                            C188727au c188727au = new C188727au();
                            String str4 = null;
                            if (baseSharePackage != null && (bundle4 = baseSharePackage.extras) != null) {
                                str = bundle4.getString("live_event_id");
                            } else {
                                str = null;
                            }
                            c188727au.LJIIIZ("live_event_id", str);
                            if (baseSharePackage != null && (bundle3 = baseSharePackage.extras) != null) {
                                str2 = bundle3.getString("live_event_author_id");
                            } else {
                                str2 = null;
                            }
                            c188727au.LJIIIZ("author_id", str2);
                            String str5 = CardStruct.IStatusCode.DEFAULT;
                            if (baseSharePackage != null && (bundle2 = baseSharePackage.extras) != null) {
                                str3 = bundle2.getString("live_event_is_anchor", CardStruct.IStatusCode.DEFAULT);
                            } else {
                                str3 = null;
                            }
                            c188727au.LJIIIZ("is_anchor", str3);
                            c188727au.LJIIIZ("platform", channel.key());
                            if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null) {
                                str4 = bundle.getString("enter_from", "");
                            }
                            c188727au.LJIIIZ("enter_from", str4);
                            if (!z2) {
                                str5 = "1";
                            }
                            c188727au.LJIIIZ("is_free_event", str5);
                            FMX.LJIIL("livesdk_live_event_share", c188727au.LIZ);
                        }
                    }
                };
                Activity LIZ = C27740Aue.LIZ(context);
                if (LIZ != null) {
                    ShareServiceImpl.LJJJLZIJ().LJJII(LIZ, liveEvent, r2, c38049EwX);
                    return;
                } else {
                    jSONObject2.put("code", 0);
                    jSONObject2.put("share_code", 0);
                    jSONObject2.put("msg", "activity is null");
                }
            }
        }
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.LIZIZ(jSONObject2);
        }
    }
}
