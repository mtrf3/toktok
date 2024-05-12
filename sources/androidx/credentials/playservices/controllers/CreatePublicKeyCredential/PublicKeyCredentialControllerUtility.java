package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AbstractC23600wG;
import X.AbstractC23670wN;
import X.AbstractC24960yS;
import X.C113554cx;
import X.C1ZW;
import X.C35041Zc;
import X.C35451aH;
import X.C35521aO;
import X.C36141bO;
import X.C36221bW;
import X.C44091oD;
import X.C44101oE;
import X.C68849R0j;
import X.C68853R0n;
import X.OSZ;
import X.PN4;
import X.QH7;
import X.R11;
import X.R12;
import X.R3J;
import android.util.Base64;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import defpackage.i0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes.dex */
public final class PublicKeyCredentialControllerUtility {
    public static final Companion Companion = new Companion();
    public static final String TAG = PublicKeyCredentialControllerUtility.class.getName();
    public static final LinkedHashMap<ErrorCode, AbstractC24960yS> orderedErrorCodeToExceptions = C113554cx.LJJJZ(new OSZ(ErrorCode.UNKNOWN_ERR, new C36221bW()), new OSZ(ErrorCode.ABORT_ERR, new AbstractC24960yS() { // from class: X.1bL
    }), new OSZ(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new AbstractC24960yS() { // from class: X.1bS
    }), new OSZ(ErrorCode.CONSTRAINT_ERR, new AbstractC24960yS() { // from class: X.1bM
    }), new OSZ(ErrorCode.DATA_ERR, new AbstractC24960yS() { // from class: X.1bN
    }), new OSZ(ErrorCode.INVALID_STATE_ERR, new AbstractC24960yS() { // from class: X.1bP
    }), new OSZ(ErrorCode.ENCODING_ERR, new C36141bO()), new OSZ(ErrorCode.NETWORK_ERR, new AbstractC24960yS() { // from class: X.1bQ
    }), new OSZ(ErrorCode.NOT_ALLOWED_ERR, new AbstractC24960yS() { // from class: X.1bR
    }), new OSZ(ErrorCode.NOT_SUPPORTED_ERR, new AbstractC24960yS() { // from class: X.1bT
    }), new OSZ(ErrorCode.SECURITY_ERR, new AbstractC24960yS() { // from class: X.1bU
    }), new OSZ(ErrorCode.TIMEOUT_ERR, new AbstractC24960yS() { // from class: X.1bV
    }));

    public static final PublicKeyCredentialCreationOptions convert(C1ZW c1zw) {
        return Companion.convert(c1zw);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final LinkedHashMap<ErrorCode, AbstractC24960yS> getOrderedErrorCodeToExceptions$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        private final AbstractC23670wN beginSignInPublicKeyCredentialResponseContainsError(AuthenticatorErrorResponse authenticatorErrorResponse) {
            ErrorCode errorCode = authenticatorErrorResponse.zza;
            o.LJIIIIZZ(errorCode, "authenticatorResponse.errorCode");
            AbstractC24960yS abstractC24960yS = getOrderedErrorCodeToExceptions$credentials_play_services_auth_release().get(errorCode);
            String str = authenticatorErrorResponse.zzb;
            if (abstractC24960yS == null) {
                return new C44101oE(new C36221bW(), i0.LJFF("unknown fido gms exception - ", str));
            }
            if (errorCode == ErrorCode.CONSTRAINT_ERR && str != null && s.LJJJLZIJ(str, "Unable to get sync account", false)) {
                return new C35521aO("Passkey retrieval was cancelled by the user.");
            }
            return new C44101oE(abstractC24960yS, str);
        }

        private final String[] convertToProperNamingScheme(AuthenticatorAttestationResponse authenticatorAttestationResponse) {
            String[] strArr = authenticatorAttestationResponse.zzd;
            o.LJIIIIZZ(strArr, "authenticatorResponse.transports");
            int i = 0;
            for (String str : strArr) {
                if (o.LJ(str, "cable")) {
                    strArr[i] = "hybrid";
                }
                i++;
            }
            return strArr;
        }

        private final byte[] getChallenge(JSONObject jSONObject) {
            String challengeB64 = jSONObject.optString("challenge", "");
            o.LJIIIIZZ(challengeB64, "challengeB64");
            if (challengeB64.length() == 0) {
                throw new JSONException("Challenge not found in request or is unexpectedly empty");
            }
            return b64Decode(challengeB64);
        }

        public final byte[] b64Decode(String str) {
            o.LJIIIZ(str, "str");
            byte[] decode = Base64.decode(str, 11);
            o.LJIIIIZZ(decode, "decode(str, FLAGS)");
            return decode;
        }

        public final String b64Encode(byte[] data) {
            o.LJIIIZ(data, "data");
            String encodeToString = Base64.encodeToString(data, 11);
            o.LJIIIIZZ(encodeToString, "encodeToString(data, FLAGS)");
            return encodeToString;
        }

        public final boolean checkAlgSupported(int i) {
            try {
                COSEAlgorithmIdentifier.LIZ(i);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final PublicKeyCredentialCreationOptions convert(C1ZW request) {
            String attestationConveyancePreference;
            o.LJIIIZ(request, "request");
            JSONObject jSONObject = new JSONObject(request.LIZ);
            C68849R0j c68849R0j = new C68849R0j();
            parseRequiredChallengeAndUser$credentials_play_services_auth_release(jSONObject, c68849R0j);
            parseRequiredRpAndParams$credentials_play_services_auth_release(jSONObject, c68849R0j);
            parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(jSONObject, c68849R0j);
            parseOptionalTimeout$credentials_play_services_auth_release(jSONObject, c68849R0j);
            parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(jSONObject, c68849R0j);
            parseOptionalExtensions$credentials_play_services_auth_release(jSONObject, c68849R0j);
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = c68849R0j.LIZ;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = c68849R0j.LIZIZ;
            byte[] bArr = c68849R0j.LIZJ;
            List list = c68849R0j.LIZLLL;
            Double d = c68849R0j.LJ;
            List list2 = c68849R0j.LJFF;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = c68849R0j.LJI;
            AttestationConveyancePreference attestationConveyancePreference2 = c68849R0j.LJII;
            if (attestationConveyancePreference2 == null) {
                attestationConveyancePreference = null;
            } else {
                attestationConveyancePreference = attestationConveyancePreference2.toString();
            }
            return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, list, d, list2, authenticatorSelectionCriteria, null, null, attestationConveyancePreference, c68849R0j.LJIIIIZZ);
        }

        public final BeginSignInRequest.PasskeyJsonRequestOptions convertToPlayAuthPasskeyJsonRequest(C35041Zc option) {
            o.LJIIIZ(option, "option");
            R12 r12 = new R12();
            r12.LIZ = true;
            r12.LIZIZ = option.LIZJ;
            return new BeginSignInRequest.PasskeyJsonRequestOptions(r12.LIZ, r12.LIZIZ);
        }

        public final BeginSignInRequest.PasskeysRequestOptions convertToPlayAuthPasskeyRequest(C35041Zc option) {
            o.LJIIIZ(option, "option");
            JSONObject jSONObject = new JSONObject(option.LIZJ);
            String rpId = jSONObject.optString("rpId", "");
            o.LJIIIIZZ(rpId, "rpId");
            if (rpId.length() == 0) {
                throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
            }
            byte[] challenge = getChallenge(jSONObject);
            R11 r11 = new R11();
            r11.LIZ = true;
            r11.LIZJ = rpId;
            r11.LIZIZ = challenge;
            boolean z = r11.LIZ;
            return new BeginSignInRequest.PasskeysRequestOptions(r11.LIZJ, r11.LIZIZ, z);
        }

        public final AbstractC23600wG publicKeyCredentialResponseContainsError(PublicKeyCredential cred) {
            o.LJIIIZ(cred, "cred");
            AuthenticatorResponse LJJJJL = cred.LJJJJL();
            if (LJJJJL instanceof AuthenticatorErrorResponse) {
                AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) LJJJJL;
                ErrorCode errorCode = authenticatorErrorResponse.zza;
                o.LJIIIIZZ(errorCode, "authenticatorResponse.errorCode");
                AbstractC24960yS abstractC24960yS = getOrderedErrorCodeToExceptions$credentials_play_services_auth_release().get(errorCode);
                String str = authenticatorErrorResponse.zzb;
                if (abstractC24960yS == null) {
                    return new C44091oD(new C36221bW(), i0.LJFF("unknown fido gms exception - ", str));
                }
                if (errorCode == ErrorCode.CONSTRAINT_ERR && str != null && s.LJJJLZIJ(str, "Unable to get sync account", false)) {
                    return new C35451aH("Passkey registration was cancelled by the user.");
                }
                return new C44091oD(abstractC24960yS, str);
            }
            return null;
        }

        public final String toAssertPasskeyResponse(SignInCredential cred) {
            AuthenticatorResponse authenticatorResponse;
            o.LJIIIZ(cred, "cred");
            JSONObject jSONObject = new JSONObject();
            PublicKeyCredential publicKeyCredential = cred.zbi;
            if (publicKeyCredential != null) {
                authenticatorResponse = publicKeyCredential.LJJJJL();
            } else {
                authenticatorResponse = null;
            }
            o.LJI(authenticatorResponse);
            if (!(authenticatorResponse instanceof AuthenticatorErrorResponse)) {
                if (authenticatorResponse instanceof AuthenticatorAssertionResponse) {
                    beginSignInAssertionResponse((AuthenticatorAssertionResponse) authenticatorResponse, jSONObject, publicKeyCredential);
                }
                String jSONObject2 = jSONObject.toString();
                o.LJIIIIZZ(jSONObject2, "json.toString()");
                return jSONObject2;
            }
            throw beginSignInPublicKeyCredentialResponseContainsError((AuthenticatorErrorResponse) authenticatorResponse);
        }

        public final String toCreatePasskeyResponseJson(PublicKeyCredential cred) {
            o.LJIIIZ(cred, "cred");
            JSONObject jSONObject = new JSONObject();
            AuthenticatorResponse LJJJJL = cred.LJJJJL();
            if (LJJJJL instanceof AuthenticatorAttestationResponse) {
                JSONObject jSONObject2 = new JSONObject();
                AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) LJJJJL;
                byte[] LJJJJL2 = authenticatorAttestationResponse.LJJJJL();
                o.LJIIIIZZ(LJJJJL2, "authenticatorResponse.clientDataJSON");
                jSONObject2.put("clientDataJSON", b64Encode(LJJJJL2));
                byte[] bArr = authenticatorAttestationResponse.zzc;
                o.LJIIIIZZ(bArr, "authenticatorResponse.attestationObject");
                jSONObject2.put("attestationObject", b64Encode(bArr));
                jSONObject2.put("transports", new JSONArray(convertToProperNamingScheme(authenticatorAttestationResponse)));
                jSONObject.put("response", jSONObject2);
            }
            addOptionalAuthenticatorAttachmentAndExtensions(cred, jSONObject);
            jSONObject.put("id", cred.zza);
            byte[] bArr2 = cred.zzc;
            o.LJIIIIZZ(bArr2, "cred.rawId");
            jSONObject.put("rawId", b64Encode(bArr2));
            jSONObject.put("type", cred.zzb);
            String jSONObject3 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject3, "json.toString()");
            return jSONObject3;
        }

        private final void addOptionalAuthenticatorAttachmentAndExtensions(PublicKeyCredential publicKeyCredential, JSONObject jSONObject) {
            List<UvmEntry> list;
            Object obj = publicKeyCredential.zzh;
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = publicKeyCredential.zzg;
            if (obj != null) {
                jSONObject.put("authenticatorAttachment", obj);
            }
            if (authenticationExtensionsClientOutputs != null) {
                try {
                    UvmEntries uvmEntries = authenticationExtensionsClientOutputs.zza;
                    if (uvmEntries != null && (list = uvmEntries.zza) != null) {
                        JSONArray jSONArray = new JSONArray();
                        for (UvmEntry uvmEntry : list) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("userVerificationMethod", uvmEntry.zza);
                            jSONObject2.put("keyProtectionType", Short.valueOf(uvmEntry.zzb));
                            jSONObject2.put("matcherProtectionType", Short.valueOf(uvmEntry.zzc));
                            jSONArray.put(jSONObject2);
                        }
                        jSONObject.put("uvm", jSONArray);
                    }
                } catch (Throwable unused) {
                }
            }
        }

        public final void parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(JSONObject json, C68849R0j builder) {
            boolean z;
            ResidentKeyRequirement residentKeyRequirement;
            String attachment;
            String residentKeyRequirement2;
            o.LJIIIZ(json, "json");
            o.LJIIIZ(builder, "builder");
            if (json.has("authenticatorSelection")) {
                JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(json, "authenticatorSelection");
                C68853R0n c68853R0n = new C68853R0n();
                boolean optBoolean = jSONObject.optBoolean("requireResidentKey", false);
                String residentKey = jSONObject.optString("residentKey", "");
                o.LJIIIIZZ(residentKey, "residentKey");
                if (residentKey.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    residentKeyRequirement = ResidentKeyRequirement.fromString(residentKey);
                } else {
                    residentKeyRequirement = null;
                }
                c68853R0n.LIZIZ = Boolean.valueOf(optBoolean);
                c68853R0n.LIZJ = residentKeyRequirement;
                String authenticatorAttachmentString = jSONObject.optString("authenticatorAttachment", "");
                o.LJIIIIZZ(authenticatorAttachmentString, "authenticatorAttachmentString");
                if (authenticatorAttachmentString.length() > 0) {
                    c68853R0n.LIZ = Attachment.fromString(authenticatorAttachmentString);
                }
                Attachment attachment2 = c68853R0n.LIZ;
                if (attachment2 == null) {
                    attachment = null;
                } else {
                    attachment = attachment2.toString();
                }
                Boolean bool = c68853R0n.LIZIZ;
                ResidentKeyRequirement residentKeyRequirement3 = c68853R0n.LIZJ;
                if (residentKeyRequirement3 == null) {
                    residentKeyRequirement2 = null;
                } else {
                    residentKeyRequirement2 = residentKeyRequirement3.toString();
                }
                builder.LJI = new AuthenticatorSelectionCriteria(attachment, bool, null, residentKeyRequirement2);
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(JSONObject json, C68849R0j builder) {
            o.LJIIIZ(json, "json");
            o.LJIIIZ(builder, "builder");
            if (json.has("extensions")) {
                JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(json, "extensions");
                R3J r3j = new R3J();
                String appIdExtension = jSONObject.optString("appid", "");
                o.LJIIIIZZ(appIdExtension, "appIdExtension");
                if (appIdExtension.length() > 0) {
                    r3j.LIZ = new FidoAppIdExtension(appIdExtension);
                }
                if (jSONObject.optBoolean("thirdPartyPayment", false)) {
                    r3j.LIZJ = new GoogleThirdPartyPaymentExtension(true);
                }
                if (jSONObject.optBoolean("uvm", false)) {
                    r3j.LIZIZ = new UserVerificationMethodExtension(true);
                }
                builder.LJIIIIZZ = new AuthenticationExtensions(r3j.LIZ, null, r3j.LIZIZ, null, null, null, null, null, r3j.LIZJ, null);
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(JSONObject json, C68849R0j builder) {
            o.LJIIIZ(json, "json");
            o.LJIIIZ(builder, "builder");
            if (json.has("timeout")) {
                builder.LJ = Double.valueOf(JSONObjectProtectorUtils.getLong(json, "timeout") / 1000);
            }
        }

        public final void parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(JSONObject json, C68849R0j builder) {
            ArrayList arrayList;
            o.LJIIIZ(json, "json");
            o.LJIIIZ(builder, "builder");
            ArrayList arrayList2 = new ArrayList();
            if (json.has("excludeCredentials")) {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(json, "excludeCredentials");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                    String string = JSONObjectProtectorUtils.getString(jSONObject, "id");
                    o.LJIIIIZZ(string, "descriptorJSON.getString(\"id\")");
                    byte[] b64Decode = b64Decode(string);
                    String descriptorType = JSONObjectProtectorUtils.getString(jSONObject, "type");
                    if (b64Decode.length != 0) {
                        o.LJIIIIZZ(descriptorType, "descriptorType");
                        if (descriptorType.length() != 0) {
                            if (jSONObject.has("transports")) {
                                arrayList = new ArrayList();
                                JSONArray jSONArray2 = JSONObjectProtectorUtils.getJSONArray(jSONObject, "transports");
                                int length2 = jSONArray2.length();
                                for (int i2 = 0; i2 < length2; i2++) {
                                    try {
                                        Transport fromString = Transport.fromString(JSONArrayProtectorUtils.getString(jSONArray2, i2));
                                        o.LJIIIIZZ(fromString, "fromString(\n            …rTransports.getString(j))");
                                        arrayList.add(fromString);
                                    } catch (PN4 e) {
                                        throw new C44091oD(new C36141bO(), e.getMessage());
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                            arrayList2.add(new PublicKeyCredentialDescriptor(descriptorType, b64Decode, arrayList));
                        }
                    }
                    throw new JSONException("PublicKeyCredentialDescriptor id or type value not found or unexpectedly empty");
                }
            }
            builder.LJFF = arrayList2;
            String str = LiveGiftNewGifterBadgeSetting.DEFAULT;
            String attestationString = json.optString("attestation", LiveGiftNewGifterBadgeSetting.DEFAULT);
            o.LJIIIIZZ(attestationString, "attestationString");
            if (attestationString.length() != 0) {
                str = attestationString;
            }
            builder.LJII = AttestationConveyancePreference.fromString(str);
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth_release(JSONObject json, C68849R0j builder) {
            o.LJIIIZ(json, "json");
            o.LJIIIZ(builder, "builder");
            byte[] challenge = getChallenge(json);
            QH7.LJIIIIZZ(challenge);
            builder.LIZJ = challenge;
            JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(json, "user");
            String string = JSONObjectProtectorUtils.getString(jSONObject, "id");
            o.LJIIIIZZ(string, "user.getString(\"id\")");
            byte[] b64Decode = b64Decode(string);
            String userName = JSONObjectProtectorUtils.getString(jSONObject, "name");
            String displayName = JSONObjectProtectorUtils.getString(jSONObject, "displayName");
            String optString = jSONObject.optString("icon", "");
            o.LJIIIIZZ(displayName, "displayName");
            if (displayName.length() != 0 && b64Decode.length != 0) {
                o.LJIIIIZZ(userName, "userName");
                if (userName.length() != 0) {
                    builder.LIZIZ = new PublicKeyCredentialUserEntity(userName, optString, displayName, b64Decode);
                    return;
                }
            }
            throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing one or more of displayName, userId or userName, or they are unexpectedly empty");
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(JSONObject json, C68849R0j builder) {
            o.LJIIIZ(json, "json");
            o.LJIIIZ(builder, "builder");
            JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(json, "rp");
            String rpId = JSONObjectProtectorUtils.getString(jSONObject, "id");
            String rpName = jSONObject.optString("name", "");
            String optString = jSONObject.optString("icon", "");
            o.LJI(optString);
            if (optString.length() == 0) {
                optString = null;
            }
            o.LJIIIIZZ(rpName, "rpName");
            if (rpName.length() != 0) {
                o.LJIIIIZZ(rpId, "rpId");
                if (rpId.length() != 0) {
                    builder.LIZ = new PublicKeyCredentialRpEntity(rpId, rpName, optString);
                    JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(json, "pubKeyCredParams");
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                        int i2 = (int) JSONObjectProtectorUtils.getLong(jSONObject2, "alg");
                        String typeParam = jSONObject2.optString("type", "");
                        o.LJIIIIZZ(typeParam, "typeParam");
                        if (typeParam.length() == 0) {
                            throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                        }
                        if (checkAlgSupported(i2)) {
                            arrayList.add(new PublicKeyCredentialParameters(typeParam, i2));
                        }
                    }
                    builder.LIZLLL = arrayList;
                    return;
                }
            }
            throw new JSONException("PublicKeyCredentialCreationOptions rp ID or rp name are missing or unexpectedly empty");
        }

        private final void beginSignInAssertionResponse(AuthenticatorAssertionResponse authenticatorAssertionResponse, JSONObject jSONObject, PublicKeyCredential publicKeyCredential) {
            JSONObject jSONObject2 = new JSONObject();
            byte[] LJJJJL = authenticatorAssertionResponse.LJJJJL();
            o.LJIIIIZZ(LJJJJL, "authenticatorResponse.clientDataJSON");
            jSONObject2.put("clientDataJSON", b64Encode(LJJJJL));
            byte[] bArr = authenticatorAssertionResponse.zzc;
            o.LJIIIIZZ(bArr, "authenticatorResponse.authenticatorData");
            jSONObject2.put("authenticatorData", b64Encode(bArr));
            byte[] bArr2 = authenticatorAssertionResponse.zzd;
            o.LJIIIIZZ(bArr2, "authenticatorResponse.signature");
            jSONObject2.put("signature", b64Encode(bArr2));
            byte[] bArr3 = authenticatorAssertionResponse.zze;
            if (bArr3 != null) {
                Companion companion = PublicKeyCredentialControllerUtility.Companion;
                o.LJI(bArr3);
                jSONObject2.put("userHandle", companion.b64Encode(bArr3));
            }
            jSONObject.put("response", jSONObject2);
            jSONObject.put("id", publicKeyCredential.zza);
            byte[] bArr4 = publicKeyCredential.zzc;
            o.LJIIIIZZ(bArr4, "publicKeyCred.rawId");
            jSONObject.put("rawId", b64Encode(bArr4));
            jSONObject.put("type", publicKeyCredential.zzb);
        }
    }
}
